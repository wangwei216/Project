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
	//���췽��
	public TestMessageDialog()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		//Ϊ��ťע�������
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	//�¼�������
	public void actionPerformed(ActionEvent e)
	{
		//���ݵ����ť�Ĳ�ͬ����ʾ��ͬ���͵���Ϣ�Ի���
		if(e.getSource()==b1)
			JOptionPane.showMessageDialog(this,
"����һ�� ERROR_MESSAGE �Ի���",
"ERROR_MESSAGE",
JOptionPane.ERROR_MESSAGE);
		if(e.getSource()==b2)
			JOptionPane.showMessageDialog(this,
"����һ�� INFORMATION_MESSAGE �Ի���"
,"INFORMATION_MESSAGE",
JOptionPane.INFORMATION_MESSAGE);
		if(e.getSource()==b3)
			JOptionPane.showMessageDialog(this,
"����һ�� PLAIN_MESSAGE �Ի���",
"PLAIN_MESSAGE",
JOptionPane.PLAIN_MESSAGE);
		if(e.getSource()==b4)
			JOptionPane.showMessageDialog(this,
"����һ�� WARNING_MESSAGE �Ի���",
"WARNING_MESSAGE",
JOptionPane.WARNING_MESSAGE);
		if(e.getSource()==b5)
			JOptionPane.showMessageDialog(this,
"����һ�� QUESTION_MESSAGE �Ի���",
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
