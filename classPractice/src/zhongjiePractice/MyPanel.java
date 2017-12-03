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

	
	JMenu fileMenue = new JMenu("����ķ�ʽ",false);
	JMenu optionMenue = new JMenu("ѡ��Ļ���",true);
	JMenu colorMenue = new JMenu("ѡ����ɫ");
	JRadioButtonMenuItem jRadioButtonMenuItem01= new JRadioButtonMenuItem("��ɫ");
	JRadioButtonMenuItem jRadioButtonMenuItem02 = new JRadioButtonMenuItem("��ɫ");
	JRadioButtonMenuItem jRadioButtonMenuItem03 = new JRadioButtonMenuItem("��ɫ");
	JRadioButtonMenuItem jRadioButtonMenuItem04 = new JRadioButtonMenuItem("��ɫ");
	JMenuItem jMenuItem01 = new JMenuItem("��Ƥ");
	JMenuItem jMenuItem02 = new JMenuItem("���");
	JMenuItem jMenuItem03 = new JMenuItem("�˳�����");
	ButtonGroup buttonGroup = new ButtonGroup();

	int clear = 0;
	Color c=new Color(255,0,0);
	
	public MyPanel() {
		setTitle("�ҵĻ���");
		JMenuBar jmb= new JMenuBar();
		setJMenuBar(jmb);
		jmb.add(fileMenue);
		jmb.add(optionMenue);
		//���Ӳ˵������ѡ����˵���
		fileMenue.add(jMenuItem01);
		fileMenue.add(jMenuItem02);
		fileMenue.addSeparator();
		fileMenue.add(jMenuItem03);
		optionMenue.add(colorMenue);
		//�ѵ�ѡ��ť�ŵ���ť���������ʵ�ֵ�ѡЧ��
		buttonGroup.add(jRadioButtonMenuItem01);
		buttonGroup.add(jRadioButtonMenuItem02);
		buttonGroup.add(jRadioButtonMenuItem03);
		buttonGroup.add(jRadioButtonMenuItem04);
		//�ٰѵ�ѡ��ť�ŵ���ɫ�˵�����ȥ
		colorMenue.add(jRadioButtonMenuItem01);
		colorMenue.add(jRadioButtonMenuItem02);
		colorMenue.add(jRadioButtonMenuItem03);
		colorMenue.addSeparator();
		colorMenue.add(jRadioButtonMenuItem04);
		
		JPanel p2 = new JPanel();
		this.getContentPane().add(p2,BorderLayout.CENTER);
		//������ע����ɫ�ı��״̬������
		jRadioButtonMenuItem01.addItemListener(this);
		jRadioButtonMenuItem02.addItemListener(this);
		jRadioButtonMenuItem03.addItemListener(this);
		jRadioButtonMenuItem04.addItemListener(this);
		//����Ϊ����ע��ļ�����
		jMenuItem01.addActionListener(this);
		jMenuItem02.addActionListener(this);
		jMenuItem03.addActionListener(this);
		
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ʵ�ֶ�������������
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
		// TODO �Զ����ɵķ������
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
