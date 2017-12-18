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
 *���������ǵ����ķɻ��࣬Ҳ����ӵ�зɻ������е����Ժͷ���
 */

public class Plane  extends GameObject{
	
/*
	Image img;
	 double x; //�����ʾ���Ʒɻ���x���y��
	 double y;
*/
	 private boolean left ,right,up, down;  //��������������� Ŀ����Ϊ��ʵ�ְ˸�������ƶ�
	 private boolean live = true ;
	 int speed =10;
	/*int width,height; //����÷ɻ����ε�����
	public Rectangle getRect(){
		
		return   new Rectangle((int)x,(int) y, width, height); //xy��ʾ���ε����꣬����������ɻ��ľ��εĿ�Ⱥ͸߶�;
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
//��ʾ����ȥ���̾ͻ�ı䷽�򲢰����㰴�¼��̵ķ����˶�	
	public void addDirection(KeyEvent e){
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT://���Ҳ����������37��ʾ���
			left = true ;
			break ;
		case KeyEvent.VK_UP: //���Ҳ����������38��ʾ�ϼ�
			up = true;
			break ;
		case KeyEvent.VK_RIGHT://���Ҳ����������39��ʾ�Ҽ�
			right = true;
			break ;
		case KeyEvent.VK_DOWN://���Ҳ����������40��ʾ�¼�
			down = true;
			break;
		default:
		break;
		}
	}
//��ʾ�ͷż��̾ͻ�ֹͣ�÷�����˶�
	public void minusDirection(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT://���Ҳ����������37��ʾ���
			left = false ;
			break ;
		case KeyEvent.VK_UP: //���Ҳ����������38��ʾ�ϼ�
			up = false;
			break ;
		case KeyEvent.VK_RIGHT://���Ҳ����������39��ʾ�Ҽ�
			right = false;
			break ;
		case KeyEvent.VK_DOWN://���Ҳ����������40��ʾ�¼�
			down = false;
			break;
		default:
		break;
		}
	}
	
	
//����һ�����췽����Ϊ�˷����Ժ󴴽�����ֵ��ʱ�򷽱�	
	public Plane(String  imgpath, double x, double y) {
		super();
		this.img = GameUtil.getImage(imgpath );
		this.height =img.getHeight(null);
		this.width =img.getWidth(null);
		this.x = x;
		this.y = y;
	}

	public  Plane(){
		//����һ���յĹ�������Ϊ���Ժ���õ�ʱ�򲻻ᱨ��
	}
}
