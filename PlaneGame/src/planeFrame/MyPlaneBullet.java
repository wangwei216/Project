package planeFrame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.security.GeneralSecurityException;

import org.omg.CORBA.PUBLIC_MEMBER;

import planeUtil.GameUtil;

public class MyPlaneBullet {

	int lunch_x,lunch_y;//�����ӵ���λ��
	int speed = 5;//������ҵķɻ����ӵ����ٶ�
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
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){  //�����¿ո����ʱ��ͻᷢ���ӵ�
			System.out.println("�����ӵ�");
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
