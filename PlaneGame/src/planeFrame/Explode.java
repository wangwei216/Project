package planeFrame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.PushbackInputStream;
import java.util.concurrent.CountDownLatch;

import planeUtil.GameUtil;

public class Explode {
	double  x,y;
	static Image[] images  = new Image[16];//定义了16个图片
	int count;
	//在把这些图片画出来之后，需要对这些图片进行初始化，静态方法需要用静态方法块
	static {
		for(int i=0;i<16;i++){
			images[i] = GameUtil.getImage("images/explode/e"+ (i+1)+".gif"); //把图片给依次给加载进去
			images[i].getWidth(null);//因为第一次会加载不出来，第二次才会加载出来
		}
	}
	public void draw(Graphics g){
		if(count<=15){
			g.drawImage(images[count],(int ) x,(int ) y, null );
			count ++;
		}
		
	}
	
	public Explode(double x, double y){
		this.x = x;    //构造器，来给爆炸的起始位置赋值
		this.y = y;
	}

}
