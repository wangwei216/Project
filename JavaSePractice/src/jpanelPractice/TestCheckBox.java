package jpanelPractice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.xml.bind.helpers.ValidationEventImpl;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TestCheckBox extends JFrame implements ItemListener{
	
	private JCheckBox  Jcheck1, Jcheck2;
	private  JTextField jtf = new JTextField("���Զ�ѡ");
	
	
	 public TestCheckBox() {
		setTitle("���Ը�ѡ��");
		Container cp = this.getContentPane();
		
		
		cp.add(jtf, BorderLayout.NORTH);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		
		p.add(Jcheck1 = new JCheckBox("�Ӵ�"));
		p.add(Jcheck2 = new JCheckBox("б��"));//����������ѡ������
		
		getContentPane().add(jtf, BorderLayout.NORTH);
		getContentPane().add(p, BorderLayout.CENTER);
		
		Jcheck1.addItemListener(this);
		Jcheck2.addItemListener(this);
		
	}
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// �ⲿ����Ϊ��������������ֵĹ���ʵ��
		
		if(e.getSource() instanceof JCheckBox){
			int selectedStyle = 0;
			//����һ��
			if(Jcheck1.isSelected()){
			selectedStyle = selectedStyle + Font.BOLD;
			}
			if(Jcheck2.isSelected()){
			selectedStyle = selectedStyle + Font.ITALIC;
			jtf.setFont(new Font("Serif",selectedStyle, 20));
			}
		}
	}
	
	public static  void main(String[] args){
		

		TestCheckBox frame = new TestCheckBox();
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
