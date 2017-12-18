package planeFrame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.security.GeneralSecurityException;

import org.omg.CORBA.PUBLIC_MEMBER;

import planeUtil.GameUtil;

public class MyPlaneBullet {

	int lunch_x,lunch_y;//发射子弹的位置
	int speed = 5;//这个是我的飞机的子弹的速度
	Image bullet;
	int y ;
	boolean YD;
	
	
	public void draw(Graphics g){
	
			g.drawImage(bullet, 100, y, null);
			move();
	  
	}
	public void move(){
		y -=speed;
	}
	
	public void shoot(KeyEvent e){
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){  //当按下空格键的时候就会发射子弹
			System.out.println("发射子弹");
			move();
		}
	}

	public MyPlaneBullet(String imagepath, int lunch_x, int lunch_y, int speed) {
		super();
		this.lunch_x = lunch_x;
		this.lunch_y = lunch_y;
		this.speed = speed;
		this.bullet= GameUtil.getImage(imagepath);
	}

	public MyPlaneBullet(){
		
	}

}
