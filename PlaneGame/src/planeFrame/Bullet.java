package planeFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.nio.channels.Pipe;
import java.util.Random;

import planeUtil.Constant;

/**
 * 这是一个子弹类 包含了子弹的所有的属性和方法
 */
public class Bullet extends GameObject {
	double degree;
	/*double  x, y; //子弹的位置
	int speed =6;
	int width =10 , height= 10 ;//这是子弹的宽度和高度
	public Rectangle getRect(){
		Rectangle r = new Rectangle((int)x,(int) y, width, height); //xy表示矩形的坐标，后面是这个子弹的矩形的宽度和高度
		return  r;
	}*/
	
	public Bullet(){ //所有的对象都要通过构造器来实现新的对象，就在构造器中构造新的角度
		degree = Math.random()*Math.PI *2;//表示0到2 PI之间
		x = Constant.GAME_WIDTH/2; //设置子弹发出的位置
		y = Constant.GAME_HEIGHT/2;
		width = 10;
		height = 10;
	}

	public void draw(Graphics g){
		
		Color c =  g.getColor();
		g.setColor(Color.yellow);
		g.fillOval((int )x, (int)y, width, height);  //xy表示子弹的坐标
		
		x += speed *Math.cos(degree); //这是子弹沿着不同的角度情况下xy轴的变化
		y += speed*Math.sin(degree);
		/**
		 * 这个功能是实现当子弹碰到窗口的边界就反弹回来的
		 */
		if((y>Constant.GAME_HEIGHT-height)||y<36){ //这个36像素是标题栏的距离
			degree = -degree;
		}
		if((x>Constant.GAME_WIDTH-width)||x<0){
			degree =Math.PI -degree;
		}
		
		g.setColor(c); //用完颜色之后记得把颜色重置为之前的颜色
	}

}
