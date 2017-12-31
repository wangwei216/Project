package framePratice;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TestPanel extends JFrame {
	JTextField  tField;
	JPanel p = new JPanel();
	JButton b[] = new JButton[16];

	public TestPanel()
	{
		super("这是测试Jpanel");
		setSize(400,400);
		tField = new JTextField("这是一个文本域");
		getContentPane().add(tField, BorderLayout.NORTH);//默认的就是网格布局
		String name[]={"1","2","3","+",//第1行
				"4","5","6","-",//第2行
				"7","8","9","*",//第3行
				"0",".","=","/",//第2行
				};
		p.setLayout(new GridLayout(4, 4));
		for(int i =0;i<name.length;i++){
			b[i]= new JButton(name[i]);
			p.add(b[i]);
		}
		
		
		getContentPane().add(p,BorderLayout.CENTER);
	}
	
	
	
	public static void main(String[] args){
		
		TestPanel frame = new TestPanel();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
}
