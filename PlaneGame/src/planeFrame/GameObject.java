package planeFrame;

import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	
	Image img;
	int speed = 5; //����Ǳ�ʾ�ɻ����ӵ��� �ٶ���һ����
	 double x; //�����ʾ��Ϸ�����������x���y��
	 double y;
	 int width,height; //�������Ϸ��������εĿ�Ⱥ͸߶�����
		public Rectangle getRect(){
			
			return   new Rectangle((int)x,(int) y, width, height); //xy��ʾ���ε����꣬����������ɻ��ľ��εĿ�Ⱥ͸߶�;
		}
		public GameObject(Image img, double x, double y, int width, int height) {
			super();
			this.img = img;
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		public GameObject(){//�չ�����
		}
}
