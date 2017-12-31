package menuPractice;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
public class PracticeMenu00 extends JFrame implements ActionListener,ItemListener{
	
	JMenuItem jmiNew, jmiOpen, jmiExit;
	JRadioButtonMenuItem jrbmiBlue, jrbmiYellow, jrbmiRed;
	
	 public PracticeMenu00() {
		 

		 
		 JMenuBar jmb= new JMenuBar();
		 setJMenuBar(jmb);
		 JMenu fileMenu =  new JMenu("文件",true);
		 JMenu OptionMenu = new JMenu("选项",true);
		 //把菜单选项添加到菜单栏里面中
		 jmb.add(fileMenu);
		 jmb.add(OptionMenu);
		 
		 JMenuItem jmiNew = new JMenuItem("新建");
		 JMenuItem  jmiOpen = new JMenuItem("打开");
		 
		 JMenuItem jmiExit = new JMenuItem("退出");
		 //把文件那个选项里面的功能（JMenuItem）给添加到JMenu选项中
		 fileMenu.add(jmiNew);
		 fileMenu.add(jmiOpen);
		 fileMenu.addSeparator();
		 fileMenu.add(jmiExit);
		 
		 
		 JCheckBoxMenuItem jmiHuanhang = new JCheckBoxMenuItem("自动换行");
		 OptionMenu.add(jmiHuanhang);
		 
		 JMenu colorMenu = new JMenu("颜色");
		 OptionMenu.add(colorMenu); //把颜色菜单放到选项栏中，
		 //再创建一个单选按钮，把红，黄 蓝放到颜色单选按钮中
		 JRadioButtonMenuItem jrbmBlue = new JRadioButtonMenuItem("蓝色");
		 JRadioButtonMenuItem jrbmRed = new JRadioButtonMenuItem("红色");
		 JRadioButtonMenuItem jrbmYellow = new JRadioButtonMenuItem("黄色");
		 colorMenu.add(jrbmYellow);
		 colorMenu.add(jrbmRed);
		 colorMenu.add(jrbmBlue);
		 //然后把单选按钮放到一个按钮组中，这样能实现单选按钮
		 ButtonGroup buttonGroup  = new ButtonGroup();
		 buttonGroup.add(jrbmYellow);
		 buttonGroup.add(jrbmRed);
		 buttonGroup.add(jrbmBlue);
		 
		 //下面就是为这些按钮注册一个监听器，如果检测的是动作就用ActionLIstener
		 jmiNew.addActionListener(this);
		 jmiOpen.addActionListener(this);
		 jmiExit.addActionListener(this);
		 //这是为你的ItemListener注册监听器
		 jrbmBlue.addItemListener(this);
		 jrbmRed.addItemListener(this);
		 jrbmYellow.addItemListener(this);
		 
		 
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// 实现动作的监听器
		if(e.getSource()==jmiNew){
			JOptionPane.showMessageDialog(this, "新建文件夹");
		}
		else if(e.getSource()==jmiOpen){
			JOptionPane.showMessageDialog(this, "打开文件夹");
		}
		else if (e.getSource()==jmiExit){
			System.exit(0);
		}
		
	}


	public void itemStateChanged(ItemEvent e) {
		// 这个是实现单选按钮的状态改变的功能,看他是不是被选中
		//如果被选中就设置一下背景
		if(e.getSource() instanceof JRadioButtonMenuItem){
			if(jrbmiBlue.isSelected())
				getContentPane().setBackground(Color.BLUE);
			
			if(jrbmiRed.isSelected())
				getContentPane().setBackground(Color.RED);
				
			if(jrbmiYellow.isSelected())
				getContentPane().setBackground(Color.YELLOW);
		}
		
		
	}
	
	public static void main (String[] args){
		PracticeMenu00  frame = new PracticeMenu00();
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}


}
