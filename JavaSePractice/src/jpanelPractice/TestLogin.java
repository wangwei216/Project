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
		setTitle("ע�����");
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		panel  = new JPanel(); //����һ�����
		panel.setLayout(new FlowLayout());
		name = new JLabel("��  ��");
		jtfName = new JTextField(7);
		age = new JLabel("��  ��");
		jtfAge = new JTextField(7);
		sex = new JLabel("��  ��");
		sexMan = new JRadioButton("��", false);
		sexWoman = new JRadioButton("Ů", true);
		//��Ҫ����ѡ���һ���飬��ѡ���ü���
		ButtonGroup group = new ButtonGroup();
		group.add(jButton1);
		group.add(jButton2);
		interest = new JLabel("��  ��");
		checkBox1 = new JCheckBox("JAVA");
		checkBox2 = new JCheckBox("C����");
		//����ط��ǽ�һ����д���ֵ����򣬲��Ҵ��й�������
		introduce = new JLabel("���Ҽ��");
		introduceArea = new JTextArea("���Ҽ��",5, 5);
		//���Ǵ���һ����������������������������ʾ����˵��Ҫ������ʾ������
		JScrollPane jScrollPane = new JScrollPane(introduce,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//���Ǵ���һ���Ի��������ܵ�����,
		jButton1 = new JButton("ȷ��");
		jButton2 = new JButton("����");
//��
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
//Ϊ���ĶԻ���ע���������
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// �ⲿ��дʵ�ּ������Ĺ���
		if(e.getSource() == jButton1){
			String mess1;
			mess1 = "������"+jtfName.getText()+ "���䣺"+jtfAge.getText();
			if(sexMan.isSelected()){
				mess1= mess1+ "�Ա���";
			}else{
				mess1 = mess1+ "�Ա�Ů";
			}
			if(checkBox1.isSelected())
				 mess1=mess1+"�� �ó���Java";
			if(checkBox2.isSelected())
				 mess1=mess1+"�� �ó���C����";
			mess1=mess1+"�� ���ҽ���:"+introduceArea.getText();
			JOptionPane.showMessageDialog(this,
					 mess1,
					 "INFORMATION_MESSAGE",
					 JOptionPane.INFORMATION_MESSAGE);
		}
		 else if (e.getSource() == jButton2)
		    {	JOptionPane.showMessageDialog(this,
		    			"��ȷ����Ϣ����",
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
