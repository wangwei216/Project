package menuPractice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.MenuBar;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.text.AbstractDocument.Content;
import javax.tools.JavaFileManager;

import jpanelPractice.TestRadio;

public class Test01 extends JFrame implements ActionListener {
	
	JPanel jPanel01 = new JPanel();
	JPanel jPanel02 = new JPanel();
	JRadioButton jButton01 = new JRadioButton("��ɫ");
	JRadioButton jButton02 = new JRadioButton("��ɫ");
	JRadioButton jButton03 = new JRadioButton("��ɫ");
	ButtonGroup buttonGroup = new ButtonGroup();
	
	public Test01(){
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		//���Ƕ���һ�����������԰�jpanel �ŵ�container��ȥ
		
		buttonGroup.add(jButton01);
		buttonGroup.add(jButton02);
		buttonGroup.add(jButton03);
		
		Container cp = this.getContentPane();
		getContentPane().add(jPanel02,BorderLayout.SOUTH);
		
		menu.add(jPanel01);
		menu.add(jPanel02);
		jPanel02.add(jButton01);
		jPanel02.add(jButton02);
		jPanel02.add(jButton03);

	}
	
public static void main(String[] args){
		
		Test01 frame = new Test01();
		frame.setSize(400,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}

@Override
public void actionPerformed(ActionEvent e) {
	
}




}
