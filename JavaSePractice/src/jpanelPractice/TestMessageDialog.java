package jpanelPractice;

// TestMessageDialog.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestMessageDialog extends JFrame implements ActionListener
{
	private JButton b1 = new JButton("ERROR");
	private JButton b2 = new JButton("INFORMATION");
	private JButton b3 = new JButton("PLAIN");
	private JButton b4 = new JButton("WARNING");
	private JButton b5 = new JButton("QUESTION");
	//构造方法
	public TestMessageDialog()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		//为按钮注册监听器
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	//事件处理方法
	public void actionPerformed(ActionEvent e)
	{
		//根据点击按钮的不同，显示不同类型的消息对话框
		if(e.getSource()==b1)
			JOptionPane.showMessageDialog(this,
"这是一个 ERROR_MESSAGE 对话框！",
"ERROR_MESSAGE",
JOptionPane.ERROR_MESSAGE);
		if(e.getSource()==b2)
			JOptionPane.showMessageDialog(this,
"这是一个 INFORMATION_MESSAGE 对话框！"
,"INFORMATION_MESSAGE",
JOptionPane.INFORMATION_MESSAGE);
		if(e.getSource()==b3)
			JOptionPane.showMessageDialog(this,
"这是一个 PLAIN_MESSAGE 对话框！",
"PLAIN_MESSAGE",
JOptionPane.PLAIN_MESSAGE);
		if(e.getSource()==b4)
			JOptionPane.showMessageDialog(this,
"这是一个 WARNING_MESSAGE 对话框",
"WARNING_MESSAGE",
JOptionPane.WARNING_MESSAGE);
		if(e.getSource()==b5)
			JOptionPane.showMessageDialog(this,
"这是一个 QUESTION_MESSAGE 对话框",
"QUESTION_MESSAGE",
JOptionPane.QUESTION_MESSAGE);		
	}
	public static void main(String[] args)
	{
		TestMessageDialog frame = new TestMessageDialog();
		frame.setSize(700,300);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
	}
}
