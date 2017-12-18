package planeFrame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.PushbackInputStream;
import java.util.concurrent.CountDownLatch;

import planeUtil.GameUtil;

public class Explode {
	double  x,y;
	static Image[] images  = new Image[16];//������16��ͼƬ
	int count;
	//�ڰ���ЩͼƬ������֮����Ҫ����ЩͼƬ���г�ʼ������̬������Ҫ�þ�̬������
	static {
		for(int i=0;i<16;i++){
			images[i] = GameUtil.getImage("images/explode/e"+ (i+1)+".gif"); //��ͼƬ�����θ����ؽ�ȥ
			images[i].getWidth(null);//��Ϊ��һ�λ���ز��������ڶ��βŻ���س���
		}
	}
	public void draw(Graphics g){
		if(count<=15){
			g.drawImage(images[count],(int ) x,(int ) y, null );
			count ++;
		}
		
	}
	
	public Explode(double x, double y){
		this.x = x;    //��������������ը����ʼλ�ø�ֵ
		this.y = y;
	}

}
