package framePratice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Application extends JFrame implements ActionListener {

	JButton jButton01 = new JButton("����ƽ��");
	JTextField jTextField01 = new JTextField(5);
	JTextField jTextField02 = new JTextField(5);
	
	
	public Application(){
		super("����һ����ƽ��");
		Container cp = this.getContentPane();//����һ���ö�������ݱ��
		cp.setLayout(new FlowLayout());		//�����һ��������Ȼ�����������з�ʽ
		
		cp.add(jTextField01);
		cp.add(jButton01);
		cp.add(jTextField02);
		/**
		 * �ⲿ����ע�������
		 */
		jTextField01.addActionListener(this);
		jButton01.addActionListener(this);
		jTextField02.setEditable(false); //�������óɲ��α༭����ʽ
	}


/**
 * �ⲿ�����¼��Ĵ�����
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = jTextField01.getText();
		
		double f = Double.parseDouble(s1); 
		double result = f*f;
		jTextField02.setText(String.valueOf(result));
	}
}
