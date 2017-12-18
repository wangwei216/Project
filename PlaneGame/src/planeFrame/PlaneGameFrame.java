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
 *����Ƿɻ���Ϸ���ڵ������ڣ���������ڴ���������طɻ���Ҳ���Ǽ�����Ƭ���Ҿ���Ҫ����һ��image�Ķ���ֱ�ӵ���GameUtil.getImage����
 */


public class PlaneGameFrame extends MyFrame{

	Image bg =  GameUtil.getImage("images/bg.jpg");
//	Image p = GameUtil.getImage("images/plane.jpg");  ���Ҳ�Ǽ���ͼƬ��һ�ַ�ʽ
	Plane p = new Plane("images/plane.jpg", 200, 200);
	
	MyPlaneBullet bullet =  new MyPlaneBullet("images/bullet.jpg",(int)p.x,(int) p.y, 5 ); 
	
	ArrayList  bulletlist = new ArrayList();  //����һ������ �⻹��һ�����ͻ�ûѧ ��ʱ�Ȳ���
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
			Bullet b =  (Bullet) bulletlist.get(i); //������������ӵ�ȡ����
			b.draw(g);
			//���ɻ����ӵ��Ƿ���ײ
			boolean  peng = b.getRect().intersects(p.getRect());
			if(peng){
				p.setLive(false );//������ϵĻ��ͰѾ��÷ɻ����������Ա��false
				//�����ӡֻ������ ֻ�ܴ�ӡһ�Σ�Ҫ��һֱ��ӡ��Ҫ����ѭ��
				
				if(bao==null){//��Ϊ���õ���ֻ��ըһ�Σ����ԶԱ�ը֮ǰ��Ҫ��һ���жϣ�������ǿ�ֵ�Ļ��ͱ�ըһ��
					
					bao = new Explode(p.x, p.y);  //����Ƿɻ���ը��λ��
					endTime = new Date();
				}
				bao.draw(g);
				break;
			}			
		}
		if(!p.isLive()) 
		{
			
			 //����ط�һ��Ӧ����Ĳ����ǻ��ʣ�Ҫ��ʾ�������ݣ������С����ɫ��������ʾ��x�����꣬y������
			 int   period = (int )(endTime.getTime() - startTime.getTime())/1000;//��Ϊ����õ��ĵ�λ��ms����Ҫ����1000ת��Ϊs
			 printGameOver(g, "ʱ�䣺"+period+"��", 25, Color.WHITE, 280, 420);
			 if(period <10){
				 printGameOver(g, "�㳤�������", 50, Color.red,200,350);
			 }
			 else if(period <20){
				 printGameOver(g, "����ܳ��ĳ�", 50, Color.red,200,350);
			 }
			 else if(period <30){
				 printGameOver(g, "�㳤�Ĳ��ÿ�", 50, Color.red,200,350);
			 }
			 else if(period <40){
				 printGameOver(g, "����˧���", 50, Color.red,200,350);
			 }
			 else{
				 printGameOver(g, "��˧�Č�ը��", 50, Color.red,200,350);
			 }
			 
		}
		
	}
	
	
	/**
	 * @author user
	 *����ǽ����˫�������� ��������Ļ������˸  �Ժ�ÿһ����Ϸ���ڶ���������
	 */
	Image ImageBuffer = null;  
	Graphics GraImage = null;  
	  
	public void update(Graphics g){     //����update��������ȡĬ�ϵĵ��ù���  
	    ImageBuffer = createImage(this.getWidth(), this.getHeight());   //����ͼ�λ�����  
	    GraImage = ImageBuffer.getGraphics();       //��ȡͼ�λ�������ͼ��������  
	    paint(GraImage);        //��paint�����б�д�Ļ�ͼ���̶�ͼ�λ�������ͼ  
	    GraImage.dispose();     //�ͷ�ͼ����������Դ  
	    g.drawImage(ImageBuffer, 0, 0, this);   //��ͼ�λ��������Ƶ���Ļ��  
	} 

	
	/**
	 * period
	 *���������ɻ���������Ϣ ���ҷ�װ���������������
	 */

	public void printGameOver(Graphics g, String str, int fontSize,Color color,int x,int y ){
							   
		Color c = g.getColor(); //�ȱ���һ����õ��Ļ��ʵ���ɫ��Ȼ�����ó�����Ҫ����ɫ�� �������֮�����������óɸտ�ʼ����ɫ
		g.setColor(color);
		Font f = new Font(str, Font.BOLD, fontSize);//ǰ����ʲô���壬�м��������񣬺����Ǵ�С
		g.setFont(f); //����һ������ʱ����Ҫ����һ�������������ԣ����û���ȥ���ò�����
		g.drawString(str, x, y);//����������ֵ�λ��
		g.setColor(c);
	}
	
	
	public void launchFrame(){
		super.launchFrame();//super���ĸ���������������ø���ķ��� �ͻ���ø����ͬ������
		addKeyListener(new KeyMonitor());     //���Ӽ��̵ļ�����Ҳ���ǿ����ü���ȥ����
		for(int i=0;i<15
				;i++){
			Bullet b = new Bullet();//��������һ���ӵ�
			bulletlist.add(b); //���ӵ�������������
		}
		startTime = new Date();
		
//		printGameOver(g, "��ǰʱ��:"(new Date()-startTime.getTime())+"��", 15, Color.white,550,38);
	}

	/**
	 * @author user
	 *����Ĵ�����������˫���弼���������Ļ��˸�����⣬�Ժ����е���Ϸ���ڶ������õ���δ���
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
	
	//�����
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("����:"+ e.getKeyCode());
			p.addDirection(e);
			bullet.shoot(e);//����Ǳ�ʾ���¼��̵�ʱ�򣬾͵��÷��书��
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("�ͷ�:"+ e.getKeyCode());
			p.minusDirection(e);
			bullet.shoot(e);
		}	
	}

	public static void main(String[] args){
		new PlaneGameFrame().launchFrame();
	}
	
}
