package jpanelPractice;

// TestDialog.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestDialog extends JFrame implements ActionListener
{
	JButton  jbt1=new JButton("显示模态对话框");
	JButton  jbt2=new JButton("显示非模态对话框");
	//创建两个对话框
	JDialog dlg1 = new JDialog(this);
	JDialog dlg2 = new JDialog(this);
	//构造方法
	public TestDialog()
	{
		setTitle("对话框");
		setSize(200,150);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jbt1);
		getContentPane().add(jbt2);
		//设置对话框dlg1为模态对话框
		dlg1.setModal(true);
		dlg1.setSize(180,100);
		dlg1.setTitle("模态对话框");
		//设置对话框dlg2为非模态对话框
		dlg2.setModal(false);
		dlg2.setSize(180,100);
		dlg2.setTitle("非模态对话框");
		//为两个按钮注册监听器
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		
	}
	//事件处理方法
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbt1)
			dlg1.setVisible(true);
		else if(e.getSource()==jbt2)
			dlg2.setVisible(true);
		
	}
	public static void main (String[] args)
	{
		TestDialog frame = new TestDialog();
		frame.setVisible(true);
	}	
}
