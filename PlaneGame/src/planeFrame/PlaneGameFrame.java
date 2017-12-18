package planeFrame;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.lang.management.MonitorInfo;
import java.util.Date;
import java.util.Locale;
import java.util.spi.CurrencyNameProvider;
import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Style;
import javax.management.monitor.Monitor;

import org.omg.PortableServer.LifespanPolicyValue;

import planeUtil.Constant;
import planeUtil.GameUtil;
import planeUtil.MyFrame;



/**
 * @author user
 *这个是飞机游戏窗口的主窗口，如果我想在窗口里面加载飞机（也就是加载照片）我就需要定义一个image的对象直接调用GameUtil.getImage方法
 */


public class PlaneGameFrame extends MyFrame{

	Image bg =  GameUtil.getImage("images/bg.jpg");
//	Image p = GameUtil.getImage("images/plane.jpg");  这个也是加载图片的一种方式
	Plane p = new Plane("images/plane.jpg", 200, 200);
	
	MyPlaneBullet bullet =  new MyPlaneBullet("images/bullet.jpg",(int)p.x,(int) p.y, 5 ); 
	
	ArrayList  bulletlist = new ArrayList();  //这是一个容器 这还是一个泛型还没学 暂时先不加
	Date startTime;
	Date endTime;

	Explode bao;

	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		p.draw(g);
//		g.drawImage(p, 200, 200, null);
		bullet.draw(g);
		

		
		for(int i=0 ;i<bulletlist.size();i++)
		{
			Bullet b =  (Bullet) bulletlist.get(i); //从容器里面把子弹取出来
			b.draw(g);
			//检测飞机跟子弹是否碰撞
			boolean  peng = b.getRect().intersects(p.getRect());
			if(peng){
				p.setLive(false );//如果碰上的话就把就让飞机的死亡属性变成false
				//如果打印只放在这 只能打印一次，要想一直打印就要跳出循环
				
				if(bao==null){//因为设置的事只爆炸一次，所以对爆炸之前需要做一次判断，如果不是空值的话就爆炸一次
					
					bao = new Explode(p.x, p.y);  //这个是飞机爆炸的位置
					endTime = new Date();
				}
				bao.draw(g);
				break;
			}			
		}
		if(!p.isLive()) 
		{
			
			 //这个地方一次应该填的参数是画笔，要显示的字内容，字体大小，颜色，字体显示的x轴坐标，y轴坐标
			 int   period = (int )(endTime.getTime() - startTime.getTime())/1000;//因为这个得到的单位是ms，需要除以1000转化为s
			 printGameOver(g, "时间："+period+"秒", 25, Color.WHITE, 280, 420);
			 if(period <10){
				 printGameOver(g, "你长的是真丑", 50, Color.red,200,350);
			 }
			 else if(period <20){
				 printGameOver(g, "你可能长的丑", 50, Color.red,200,350);
			 }
			 else if(period <30){
				 printGameOver(g, "你长的不好看", 50, Color.red,200,350);
			 }
			 else if(period <40){
				 printGameOver(g, "你是帅哥吧", 50, Color.red,200,350);
			 }
			 else{
				 printGameOver(g, "你帅的屌炸天", 50, Color.red,200,350);
			 }
			 
		}
		
	}
	
	
	/**
	 * @author user
	 *这个是解决了双缓冲问题 可以让屏幕不再闪烁  以后每一个游戏窗口都可以适用
	 */
	Image ImageBuffer = null;  
	Graphics GraImage = null;  
	  
	public void update(Graphics g){     //覆盖update方法，截取默认的调用过程  
	    ImageBuffer = createImage(this.getWidth(), this.getHeight());   //创建图形缓冲区  
	    GraImage = ImageBuffer.getGraphics();       //获取图形缓冲区的图形上下文  
	    paint(GraImage);        //用paint方法中编写的绘图过程对图形缓冲区绘图  
	    GraImage.dispose();     //释放图形上下文资源  
	    g.drawImage(ImageBuffer, 0, 0, this);   //将图形缓冲区绘制到屏幕上  
	} 

	
	/**
	 * period
	 *这个是输出飞机死亡的信息 并且封装到下面这个方法中
	 */

	public void printGameOver(Graphics g, String str, int fontSize,Color color,int x,int y ){
							   
		Color c = g.getColor(); //先保存一个你得到的画笔的颜色，然后设置成你想要的颜色， 最后用完之后再重新设置成刚开始的颜色
		g.setColor(color);
		Font f = new Font(str, Font.BOLD, fontSize);//前面是什么字体，中间是字体风格，后面是大小
		g.setFont(f); //设置一个字体时，先要创建一个字体对象的属性，再用画笔去调用并设置
		g.drawString(str, x, y);//这是字体出现的位置
		g.setColor(c);
	}
	
	
	public void launchFrame(){
		super.launchFrame();//super在哪个方法名字里面调用父类的方法 就会调用父类的同名方法
		addKeyListener(new KeyMonitor());     //增加键盘的监听，也就是可以用键盘去控制
		for(int i=0;i<15
				;i++){
			Bullet b = new Bullet();//创建生成一堆子弹
			bulletlist.add(b); //把子弹丢到容器里面
		}
		startTime = new Date();
		
//		printGameOver(g, "当前时间:"(new Date()-startTime.getTime())+"秒", 15, Color.white,550,38);
	}

	/**
	 * @author user
	 *下面的代码是利用了双缓冲技术解决的屏幕闪烁的问题，以后所有的游戏窗口都可以用到这段代码
	 */
	/*
	 	private Image offscreenImage = null;
		public void update(Graphics g){
		if(offscreenImage == null ){
			offscreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
			Graphics gOff = offscreenImage.getGraphics();
			paint(gOff);
			g.drawImage(offscreenImage, 0, 0, null);
		}
	}*/
	
	//定义的
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("按下:"+ e.getKeyCode());
			p.addDirection(e);
			bullet.shoot(e);//这个是表示按下键盘的时候，就调用发射功能
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("释放:"+ e.getKeyCode());
			p.minusDirection(e);
			bullet.shoot(e);
		}	
	}

	public static void main(String[] args){
		new PlaneGameFrame().launchFrame();
	}
	
}
