package framePratice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 1, 先创建你需要的对象 比如按钮，文本框， 面板什么的
 * 2，然后是先构造一个构造方法，也就是初始化的界面
 * 3，构建一个container容器来容纳这些组件，
 * 
 *
 */
public class PracticePanel extends JFrame {
	
	
	JTextField tfField;
	JPanel panel = new JPanel();
	JButton b[] = new JButton[35];
	
	public PracticePanel(){
		
		Container cp = this.getContentPane();
		cp.add(new JButton("讲台"), BorderLayout.NORTH);
		
		
		panel.setLayout(new GridLayout(7, 5));
		
		for(int i=0 ;i<35;i++){
			panel.add(new JButton("座位"+i));
		}
		cp.add(panel,BorderLayout.CENTER);
		
	}
	
	
	public static void main(String[] args){
		
		PracticePanel frame = new PracticePanel();
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	

}