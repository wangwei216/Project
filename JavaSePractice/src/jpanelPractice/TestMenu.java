package jpanelPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestMenu extends JFrame implements ActionListener,ItemListener
{
	private JMenuItem jmiNew,jmiOpen,jmiExit;
	private JRadioButtonMenuItem jrbmiBlue,jrbmiYellow,jrbmiRed;	

	public TestMenu()
	{
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		JMenu fileMenu = new JMenu("�ļ�", true);
		JMenu OptionMenu = new JMenu("ѡ��", true);
		jmb.add(fileMenu);
		jmb.add(OptionMenu);
		
		fileMenu.add(jmiNew = new JMenuItem("�½�"));
		fileMenu.add(jmiOpen = new JMenuItem("��"));
		fileMenu.addSeparator();//�ڲ˵������һ���ָ��� 
		fileMenu.add(jmiExit = new JMenuItem("�˳�"));

		
		OptionMenu.add(new JCheckBoxMenuItem("�Զ�����"));
				
		JMenu colorSubMenu=new JMenu("��ɫ"); 
		OptionMenu.add(colorSubMenu);
		colorSubMenu.add(jrbmiBlue=new JRadioButtonMenuItem("��ɫ"));
		colorSubMenu.add(jrbmiYellow=new JRadioButtonMenuItem("��ɫ"));
		colorSubMenu.add(jrbmiRed=new JRadioButtonMenuItem("��ɫ"));
		ButtonGroup btg=new ButtonGroup();
		btg.add(jrbmiBlue);
		btg.add(jrbmiYellow);
		btg.add(jrbmiRed);

		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiExit.addActionListener(this);
		
		jrbmiBlue.addItemListener(this);
		jrbmiYellow.addItemListener(this);
		jrbmiRed.addItemListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jmiNew)
			JOptionPane.showMessageDialog(this,"�½��ļ�");
		else if(e.getSource()==jmiOpen)
			JOptionPane.showMessageDialog(this,"���ļ�");
		else if(e.getSource()==jmiExit)
			System.exit(0);

	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() instanceof JRadioButtonMenuItem)
		{
			if(jrbmiBlue.isSelected())
				getContentPane().setBackground(Color.BLUE);
			if(jrbmiYellow.isSelected())
				getContentPane().setBackground(Color.YELLOW);
			if(jrbmiRed.isSelected())
				getContentPane().setBackground(Color.RED);
		}
		
	}
	public static void main(String[] args)
	{
		TestMenu frame = new TestMenu();
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
	}
}
