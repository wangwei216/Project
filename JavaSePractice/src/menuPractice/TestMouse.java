package menuPractice;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.security.auth.x500.X500Principal;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JFrame;

public class TestMouse extends JFrame implements MouseListener,MouseMotionListener {

	int startX;
	int startY ;
	
	
	public TestMouse(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
		 startX = e.getX();
		 startY = e.getY();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO �Զ����ɵķ������
		// ʵ���϶����Ĺ���
				int endX = e.getX();
				int endY = e.getY();
				Graphics g = this.getGraphics();
				g.drawLine(startX,startY,endX, endY); //����ط���ʱ�� һ����������ı������ܱ���һ���������е�ʵ�֣���Ҫת��Ϊ����
				startX = endX;
				startY = endY;
				if(e.isMetaDown()){//�����ǲ����Ҽ�,��Ƥ�������û�һ��԰ �������ó�һ���ı�����ɫ
					g.setColor(this.getBackground());
					g.fillOval(endX-10, endY-10, 50, 50);
				}
				else {
					g.drawLine(startX,startY,endX, endY); //����ط���ʱ�� һ����������ı������ܱ���һ���������е�ʵ�֣���Ҫת��Ϊ����
					startX = endX;
					startY = endY;
				}
	}


	
	public static void main(String[] args){
		TestMouse frame = new TestMouse();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
	}

	
}
