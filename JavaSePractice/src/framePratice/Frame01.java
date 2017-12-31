package framePratice;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame01 extends JFrame {

	/**
	 * 这是一个我的窗口类， 我要在这个里面写出我需要窗口的功能
	 */
	
	public Frame01(){
		super("窗口练习");
	
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		JButton jButton02  = new JButton("确定");
		JButton jButton03 = new JButton("取消");
		JButton jButton01 = new JButton("这是按钮");
		cp.add(jButton03, BorderLayout.EAST);
		cp.add(jButton02,BorderLayout.NORTH);
		cp.add(jButton01, BorderLayout.WEST);
		
		 
	

		
	}
}
