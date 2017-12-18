package planeFrame;

import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	
	Image img;
	int speed = 5; //这个是表示飞机和子弹的 速度是一样的
	 double x; //这个表示游戏所有物体类的x轴和y轴
	 double y;
	 int width,height; //定义该游戏物体类矩形的宽度和高度属性
		public Rectangle getRect(){
			
			return   new Rectangle((int)x,(int) y, width, height); //xy表示矩形的坐标，后面是这个飞机的矩形的宽度和高度;
		}
		public GameObject(Image img, double x, double y, int width, int height) {
			super();
			this.img = img;
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		public GameObject(){//空构造器
		}
}
