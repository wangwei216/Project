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
		 JMenu fileMenu =  new JMenu("�ļ�",true);
		 JMenu OptionMenu = new JMenu("ѡ��",true);
		 //�Ѳ˵�ѡ����ӵ��˵���������
		 jmb.add(fileMenu);
		 jmb.add(OptionMenu);
		 
		 JMenuItem jmiNew = new JMenuItem("�½�");
		 JMenuItem  jmiOpen = new JMenuItem("��");
		 
		 JMenuItem jmiExit = new JMenuItem("�˳�");
		 //���ļ��Ǹ�ѡ������Ĺ��ܣ�JMenuItem������ӵ�JMenuѡ����
		 fileMenu.add(jmiNew);
		 fileMenu.add(jmiOpen);
		 fileMenu.addSeparator();
		 fileMenu.add(jmiExit);
		 
		 
		 JCheckBoxMenuItem jmiHuanhang = new JCheckBoxMenuItem("�Զ�����");
		 OptionMenu.add(jmiHuanhang);
		 
		 JMenu colorMenu = new JMenu("��ɫ");
		 OptionMenu.add(colorMenu); //����ɫ�˵��ŵ�ѡ�����У�
		 //�ٴ���һ����ѡ��ť���Ѻ죬�� ���ŵ���ɫ��ѡ��ť��
		 JRadioButtonMenuItem jrbmBlue = new JRadioButtonMenuItem("��ɫ");
		 JRadioButtonMenuItem jrbmRed = new JRadioButtonMenuItem("��ɫ");
		 JRadioButtonMenuItem jrbmYellow = new JRadioButtonMenuItem("��ɫ");
		 colorMenu.add(jrbmYellow);
		 colorMenu.add(jrbmRed);
		 colorMenu.add(jrbmBlue);
		 //Ȼ��ѵ�ѡ��ť�ŵ�һ����ť���У�������ʵ�ֵ�ѡ��ť
		 ButtonGroup buttonGroup  = new ButtonGroup();
		 buttonGroup.add(jrbmYellow);
		 buttonGroup.add(jrbmRed);
		 buttonGroup.add(jrbmBlue);
		 
		 //�������Ϊ��Щ��ťע��һ������������������Ƕ�������ActionLIstener
		 jmiNew.addActionListener(this);
		 jmiOpen.addActionListener(this);
		 jmiExit.addActionListener(this);
		 //����Ϊ���ItemListenerע�������
		 jrbmBlue.addItemListener(this);
		 jrbmRed.addItemListener(this);
		 jrbmYellow.addItemListener(this);
		 
		 
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// ʵ�ֶ����ļ�����
		if(e.getSource()==jmiNew){
			JOptionPane.showMessageDialog(this, "�½��ļ���");
		}
		else if(e.getSource()==jmiOpen){
			JOptionPane.showMessageDialog(this, "���ļ���");
		}
		else if (e.getSource()==jmiExit){
			System.exit(0);
		}
		
	}


	public void itemStateChanged(ItemEvent e) {
		// �����ʵ�ֵ�ѡ��ť��״̬�ı�Ĺ���,�����ǲ��Ǳ�ѡ��
		//�����ѡ�о�����һ�±���
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
