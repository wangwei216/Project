package zhongjiePractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class MyPanel extends JFrame implements ActionListener,ItemListener{

	
	JMenu fileMenue = new JMenu("清除的方式",false);
	JMenu optionMenue = new JMenu("选择的画笔",true);
	JMenu colorMenue = new JMenu("选择颜色");
	JRadioButtonMenuItem jRadioButtonMenuItem01= new JRadioButtonMenuItem("红色");
	JRadioButtonMenuItem jRadioButtonMenuItem02 = new JRadioButtonMenuItem("蓝色");
	JRadioButtonMenuItem jRadioButtonMenuItem03 = new JRadioButtonMenuItem("黄色");
	JRadioButtonMenuItem jRadioButtonMenuItem04 = new JRadioButtonMenuItem("黑色");
	JMenuItem jMenuItem01 = new JMenuItem("橡皮");
	JMenuItem jMenuItem02 = new JMenuItem("清除");
	JMenuItem jMenuItem03 = new JMenuItem("退出界面");
	ButtonGroup buttonGroup = new ButtonGroup();

	int clear = 0;
	Color c=new Color(255,0,0);
	
	public MyPanel() {
		setTitle("我的画板");
		JMenuBar jmb= new JMenuBar();
		setJMenuBar(jmb);
		jmb.add(fileMenue);
		jmb.add(optionMenue);
		//把子菜单里面的选项给菜单项
		fileMenue.add(jMenuItem01);
		fileMenue.add(jMenuItem02);
		fileMenue.addSeparator();
		fileMenue.add(jMenuItem03);
		optionMenue.add(colorMenue);
		//把单选按钮放到按钮组里面才能实现单选效果
		buttonGroup.add(jRadioButtonMenuItem01);
		buttonGroup.add(jRadioButtonMenuItem02);
		buttonGroup.add(jRadioButtonMenuItem03);
		buttonGroup.add(jRadioButtonMenuItem04);
		//再把单选按钮放到颜色菜单栏里去
		colorMenue.add(jRadioButtonMenuItem01);
		colorMenue.add(jRadioButtonMenuItem02);
		colorMenue.add(jRadioButtonMenuItem03);
		colorMenue.addSeparator();
		colorMenue.add(jRadioButtonMenuItem04);
		
		JPanel p2 = new JPanel();
		this.getContentPane().add(p2,BorderLayout.CENTER);
		//下面是注册颜色改变的状态监听器
		jRadioButtonMenuItem01.addItemListener(this);
		jRadioButtonMenuItem02.addItemListener(this);
		jRadioButtonMenuItem03.addItemListener(this);
		jRadioButtonMenuItem04.addItemListener(this);
		//这是为动作注册的监听器
		jMenuItem01.addActionListener(this);
		jMenuItem02.addActionListener(this);
		jMenuItem03.addActionListener(this);
		
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 实现动作监听器功能
		Graphics g = getGraphics();
		if(e.getSource()==jMenuItem03){
			System.exit(0);
		}
		else if (e.getSource()==jMenuItem02){
			clear=1;
		}
		else if (e.getSource()==jMenuItem01){
			c= getBackground();
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() instanceof JRadioButtonMenuItem){
			
			
			
			
		}
		
	}
	
	public static void main(String[] args){
		
		MyPanel frame = new MyPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
	}


}
