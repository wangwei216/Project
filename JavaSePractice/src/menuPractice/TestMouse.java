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
		// TODO 自动生成的方法存根
		
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
		// TODO 自动生成的方法存根
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自动生成的方法存根
		// 实现拖动鼠标的功能
				int endX = e.getX();
				int endY = e.getY();
				Graphics g = this.getGraphics();
				g.drawLine(startX,startY,endX, endY); //这个地方的时候 一个方法里面的变量不能被另一个方法题中的实现，需要转换为属性
				startX = endX;
				startY = endY;
				if(e.isMetaDown()){//看看是不是右键,橡皮擦就是用画一个园 并且设置成一样的背景颜色
					g.setColor(this.getBackground());
					g.fillOval(endX-10, endY-10, 50, 50);
				}
				else {
					g.drawLine(startX,startY,endX, endY); //这个地方的时候 一个方法里面的变量不能被另一个方法题中的实现，需要转换为属性
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
