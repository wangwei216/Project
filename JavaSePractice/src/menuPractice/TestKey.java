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
		//����ǰ�myPanuel �ŵ�������ȥ
		
		this.getContentPane().add(new MyPanel());
		this.addKeyListener(this);
	}

	class	MyPanel extends JPanel{
		int x = 100;
		int y = 100;
		char c = '��';
		//���¶���һ��
		public void paintComponent(Graphics g){
			super.paintComponent(g);//���ƿհ����
			g.drawString(String.valueOf(c), x, y); //��char�е�ֵת��Ϊ String����
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɵķ������
		mp.c = e.getKeyChar();
		mp.repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		
	}
	
	public static void main(String[] args){
		TestKey frame = new TestKey();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
	
	
	}
}
