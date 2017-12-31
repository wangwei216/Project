package menuPractice;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.IOP.Codec;



public class TestKey extends JFrame implements KeyListener  {
	MyPanel mp = new MyPanel();
	public TestKey(){
		//这个是吧myPanuel 放到容器中去
		
		this.getContentPane().add(new MyPanel());
		this.addKeyListener(this);
	}

	class	MyPanel extends JPanel{
		int x = 100;
		int y = 100;
		char c = '王';
		//重新定义一个
		public void paintComponent(Graphics g){
			super.paintComponent(g);//绘制空白组件
			g.drawString(String.valueOf(c), x, y); //把char中的值转换为 String类型
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		mp.c = e.getKeyChar();
		mp.repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		int code = e.getKeyCode();
		switch(code){

		case KeyEvent.VK_LEFT: mp.x -= 10;break;
		case KeyEvent.VK_RIGHT: mp.x += 10;break;
		case KeyEvent.VK_UP: mp.y -= 10;break;
		case KeyEvent.VK_DOWN: mp.y += 10;
		}
		mp.repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
	public static void main(String[] args){
		TestKey frame = new TestKey();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
	
	
	}
}
