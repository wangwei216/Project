package planeFrame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.prefs.BackingStoreException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.omg.CORBA.PUBLIC_MEMBER;

import planeUtil.GameUtil;

/**
 * @author user
 *这个定义的是单纯的飞机类，也就是拥有飞机的所有的属性和方法
 */

public class Plane  extends GameObject{
	
/*
	Image img;
	 double x; //这个表示控制飞机的x轴和y轴
	 double y;
*/
	 private boolean left ,right,up, down;  //这个代表上下左右 目的是为了实现八个方向的移动
	 private boolean live = true ;
	 int speed =10;
	/*int width,height; //定义该飞机矩形的属性
	public Rectangle getRect(){
		
		return   new Rectangle((int)x,(int) y, width, height); //xy表示矩形的坐标，后面是这个飞机的矩形的宽度和高度;
	}
	*/
	
	public void draw(Graphics g){
		if(live){
			g.drawImage(img, (int)x , (int)y, null);
			move();
		}
		
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public void move(){
		if(left){
			x -=speed;
		}
		if(right){
			x +=speed;
		}
		if(up){
			y -=speed;
		}
		if(down ){
			y +=speed;
		}

	}
//表示按下去键盘就会改变方向并按照你按下键盘的方向运动	
	public void addDirection(KeyEvent e){
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT://这个也可以用数字37表示左键
			left = true ;
			break ;
		case KeyEvent.VK_UP: //这个也可以用数字38表示上键
			up = true;
			break ;
		case KeyEvent.VK_RIGHT://这个也可以用数字39表示右键
			right = true;
			break ;
		case KeyEvent.VK_DOWN://这个也可以用数字40表示下键
			down = true;
			break;
		default:
		break;
		}
	}
//表示释放键盘就会停止该方向的运动
	public void minusDirection(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT://这个也可以用数字37表示左键
			left = false ;
			break ;
		case KeyEvent.VK_UP: //这个也可以用数字38表示上键
			up = false;
			break ;
		case KeyEvent.VK_RIGHT://这个也可以用数字39表示右键
			right = false;
			break ;
		case KeyEvent.VK_DOWN://这个也可以用数字40表示下键
			down = false;
			break;
		default:
		break;
		}
	}
	
	
//这是一个构造方法，为了方便以后创建对象赋值的时候方便	
	public Plane(String  imgpath, double x, double y) {
		super();
		this.img = GameUtil.getImage(imgpath );
		this.height =img.getHeight(null);
		this.width =img.getWidth(null);
		this.x = x;
		this.y = y;
	}

	public  Plane(){
		//这是一个空的构造器，为了以后调用的时候不会报错
	}
}
