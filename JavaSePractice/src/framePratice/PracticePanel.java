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
 * 1, �ȴ�������Ҫ�Ķ��� ���簴ť���ı��� ���ʲô��
 * 2��Ȼ�����ȹ���һ�����췽����Ҳ���ǳ�ʼ���Ľ���
 * 3������һ��container������������Щ�����
 * 
 *
 */
public class PracticePanel extends JFrame {
	
	
	JTextField tfField;
	JPanel panel = new JPanel();
	JButton b[] = new JButton[35];
	
	public PracticePanel(){
		
		Container cp = this.getContentPane();
		cp.add(new JButton("��̨"), BorderLayout.NORTH);
		
		
		panel.setLayout(new GridLayout(7, 5));
		
		for(int i=0 ;i<35;i++){
			panel.add(new JButton("��λ"+i));
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