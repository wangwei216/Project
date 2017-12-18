package planeFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.nio.channels.Pipe;
import java.util.Random;

import planeUtil.Constant;

/**
 * ����һ���ӵ��� �������ӵ������е����Ժͷ���
 */
public class Bullet extends GameObject {
	double degree;
	/*double  x, y; //�ӵ���λ��
	int speed =6;
	int width =10 , height= 10 ;//�����ӵ��Ŀ�Ⱥ͸߶�
	public Rectangle getRect(){
		Rectangle r = new Rectangle((int)x,(int) y, width, height); //xy��ʾ���ε����꣬����������ӵ��ľ��εĿ�Ⱥ͸߶�
		return  r;
	}*/
	
	public Bullet(){ //���еĶ���Ҫͨ����������ʵ���µĶ��󣬾��ڹ������й����µĽǶ�
		degree = Math.random()*Math.PI *2;//��ʾ0��2 PI֮��
		x = Constant.GAME_WIDTH/2; //�����ӵ�������λ��
		y = Constant.GAME_HEIGHT/2;
		width = 10;
		height = 10;
	}

	public void draw(Graphics g){
		
		Color c =  g.getColor();
		g.setColor(Color.yellow);
		g.fillOval((int )x, (int)y, width, height);  //xy��ʾ�ӵ�������
		
		x += speed *Math.cos(degree); //�����ӵ����Ų�ͬ�ĽǶ������xy��ı仯
		y += speed*Math.sin(degree);
		/**
		 * ���������ʵ�ֵ��ӵ��������ڵı߽�ͷ���������
		 */
		if((y>Constant.GAME_HEIGHT-height)||y<36){ //���36�����Ǳ������ľ���
			degree = -degree;
		}
		if((x>Constant.GAME_WIDTH-width)||x<0){
			degree =Math.PI -degree;
		}
		
		g.setColor(c); //������ɫ֮��ǵð���ɫ����Ϊ֮ǰ����ɫ
	}

}
