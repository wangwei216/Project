package jpanelPractice;

// TestDialog.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestDialog extends JFrame implements ActionListener
{
	JButton  jbt1=new JButton("��ʾģ̬�Ի���");
	JButton  jbt2=new JButton("��ʾ��ģ̬�Ի���");
	//���������Ի���
	JDialog dlg1 = new JDialog(this);
	JDialog dlg2 = new JDialog(this);
	//���췽��
	public TestDialog()
	{
		setTitle("�Ի���");
		setSize(200,150);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jbt1);
		getContentPane().add(jbt2);
		//���öԻ���dlg1Ϊģ̬�Ի���
		dlg1.setModal(true);
		dlg1.setSize(180,100);
		dlg1.setTitle("ģ̬�Ի���");
		//���öԻ���dlg2Ϊ��ģ̬�Ի���
		dlg2.setModal(false);
		dlg2.setSize(180,100);
		dlg2.setTitle("��ģ̬�Ի���");
		//Ϊ������ťע�������
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		
	}
	//�¼�������
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
