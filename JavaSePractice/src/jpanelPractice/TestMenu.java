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
		JMenu fileMenu = new JMenu("文件", true);
		JMenu OptionMenu = new JMenu("选项", true);
		jmb.add(fileMenu);
		jmb.add(OptionMenu);
		
		fileMenu.add(jmiNew = new JMenuItem("新建"));
		fileMenu.add(jmiOpen = new JMenuItem("打开"));
		fileMenu.addSeparator();//在菜单中添加一条分隔线 
		fileMenu.add(jmiExit = new JMenuItem("退出"));

		
		OptionMenu.add(new JCheckBoxMenuItem("自动换行"));
				
		JMenu colorSubMenu=new JMenu("颜色"); 
		OptionMenu.add(colorSubMenu);
		colorSubMenu.add(jrbmiBlue=new JRadioButtonMenuItem("蓝色"));
		colorSubMenu.add(jrbmiYellow=new JRadioButtonMenuItem("黄色"));
		colorSubMenu.add(jrbmiRed=new JRadioButtonMenuItem("红色"));
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
			JOptionPane.showMessageDialog(this,"新建文件");
		else if(e.getSource()==jmiOpen)
			JOptionPane.showMessageDialog(this,"打开文件");
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
