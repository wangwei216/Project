package jpanelPractice;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

import javax.naming.NameNotFoundException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class TestLogin extends JFrame implements ActionListener {
	JLabel name, age, sex, interest ,introduce;
	JTextField jtfName, jtfAge;
	JCheckBox  checkBox1, checkBox2;
	JRadioButton sexMan, sexWoman;
	JButton jButton1;
	JButton jButton2;
	JTextArea introduceArea;
	JPanel panel;
	public TestLogin() {
		setTitle("注册界面");
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		panel  = new JPanel(); //创建一个面板
		panel.setLayout(new FlowLayout());
		name = new JLabel("姓  名");
		jtfName = new JTextField(7);
		age = new JLabel("年  龄");
		jtfAge = new JTextField(7);
		sex = new JLabel("性  别");
		sexMan = new JRadioButton("男", false);
		sexWoman = new JRadioButton("女", true);
		//需要给单选框加一个组，复选框不用加组
		ButtonGroup group = new ButtonGroup();
		group.add(jButton1);
		group.add(jButton2);
		interest = new JLabel("擅  长");
		checkBox1 = new JCheckBox("JAVA");
		checkBox2 = new JCheckBox("C语言");
		//这个地方是建一个能写文字的区域，并且带有滚动条，
		introduce = new JLabel("自我简介");
		introduceArea = new JTextArea("自我简介",5, 5);
		//这是创建一个滚动条，可以设置让他总是显示还是说需要的在显示滚动条
		JScrollPane jScrollPane = new JScrollPane(introduce,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//这是创建一个对话框，让他能弹出来,
		jButton1 = new JButton("确定");
		jButton2 = new JButton("重置");
//把
		panel.add(name);
		panel.add(jtfName);
		panel.add(age);
		panel.add(jtfAge);
		panel.add(sex);
		panel.add(sexMan);
		panel.add(sexWoman);
		panel.add(interest);
		panel.add(introduceArea);
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(introduce);
		panel.add(jButton1);
		panel.add(jButton2);

	
		cp.add(panel);
//为最后的对话框注册监听器，
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// 这部分写实现监听器的功能
		if(e.getSource() == jButton1){
			String mess1;
			mess1 = "姓名："+jtfName.getText()+ "年龄："+jtfAge.getText();
			if(sexMan.isSelected()){
				mess1= mess1+ "性别：男";
			}else{
				mess1 = mess1+ "性别：女";
			}
			if(checkBox1.isSelected())
				 mess1=mess1+"， 擅长：Java";
			if(checkBox2.isSelected())
				 mess1=mess1+"， 擅长：C语言";
			mess1=mess1+"， 自我介绍:"+introduceArea.getText();
			JOptionPane.showMessageDialog(this,
					 mess1,
					 "INFORMATION_MESSAGE",
					 JOptionPane.INFORMATION_MESSAGE);
		}
		 else if (e.getSource() == jButton2)
		    {	JOptionPane.showMessageDialog(this,
		    			"您确定信息重置",
		    			"WARNING_MESSAGE",
		    			JOptionPane.WARNING_MESSAGE);
		    	jtfName.setText("");
		    	jtfAge.setText("");
		    	introduceArea.setText("");
		    }
		
	}

	public static void main(String[] args){
		TestLogin frame = new TestLogin();
		frame.setVisible(true);
		frame.setSize(150,800);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
