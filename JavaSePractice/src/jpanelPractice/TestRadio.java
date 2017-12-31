package jpanelPractice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ItemListener;
import java.security.acl.Group;
import java.util.jar.JarEntry;
import java.util.zip.GZIPOutputStream;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.event.*;
import framePratice.TestPanel;
import framePratice.TestRadioButton;

/**
 * 1.�ȴ���һ����ť
 *
 */
public class TestRadio extends JFrame implements ItemListener{
	JTextField jtField = new JTextField("hello");
	private  JRadioButton jRadioButton1 =new JRadioButton("���",false);
	private  JRadioButton jRadioButton2 = new JRadioButton("�м�",false);
	private  JRadioButton jRadioButton3 = new JRadioButton("��",false);
	private ButtonGroup group = new ButtonGroup();
	
	public TestRadio(){
		super("���Ե�ѡ��ť");
		Container cp = this.getContentPane();//�Ƚ�һ������
		
		JPanel panel = new JPanel();//���Ǵ�����һ�����
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20,10));
		panel.add(jRadioButton1);
		panel.add(jRadioButton2);
		panel.add(jRadioButton3);
		
		group.add(jRadioButton1);
		group.add(jRadioButton2);
		group.add(jRadioButton3);
		getContentPane().add(jtField, BorderLayout.NORTH);
		getContentPane().add(panel, BorderLayout.CENTER);
		jRadioButton1.addItemListener(this);
		jRadioButton2.addItemListener(this);
		jRadioButton3.addItemListener(this);
	}

	
	public void itemStateChanged(ItemEvent e){
		if(e.getSource() instanceof JRadioButton){
			if(jRadioButton1.isSelected()){
				jtField.setHorizontalAlignment(JTextField.LEFT);
				
			}
			if(jRadioButton2.isSelected()){
				jtField.setHorizontalAlignment(JTextField.CENTER);
			}
			if(jRadioButton3.isSelected()){
				jtField.setHorizontalAlignment(JTextField.RIGHT);
			}
		}
	}

	public static void main(String[] args){
		
		TestRadio frame = new TestRadio();
		frame.setSize(400,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
}
