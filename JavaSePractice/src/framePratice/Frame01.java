package framePratice;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame01 extends JFrame {

	/**
	 * ����һ���ҵĴ����࣬ ��Ҫ���������д������Ҫ���ڵĹ���
	 */
	
	public Frame01(){
		super("������ϰ");
	
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		JButton jButton02  = new JButton("ȷ��");
		JButton jButton03 = new JButton("ȡ��");
		JButton jButton01 = new JButton("���ǰ�ť");
		cp.add(jButton03, BorderLayout.EAST);
		cp.add(jButton02,BorderLayout.NORTH);
		cp.add(jButton01, BorderLayout.WEST);
		
		 
	

		
	}
}
