package framePratice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.NonWritableChannelException;

import javax.accessibility.Accessible;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;
import javax.xml.soap.Text;

/**
 * @author user
 *���ַ���ת��Ϊ double������Ҫ�� parseDouble�������
 *Ҫ������κ����͵�����ת��Ϊ�ַ������͵�ʱ��Ҫ�õ� string��valueOf������
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class Calculator extends JFrame implements ActionListener {
	
	JLabel jLabel = new JLabel("+");
	JButton JB01= new JButton("ȷ��");
	JButton JB02 = new JButton("=");
	JTextField text3 = new JTextField(6);
	JTextField text2 = new JTextField(6);
	JTextField txt = new JTextField(6); //���ǿյ��ı�������������ı��򳤶�
	public Calculator(){
		super("������");
		Container cp = this.getContentPane();//����Ҫ���ڹ�������
		cp.add(txt);
		cp.add(jLabel);
		cp.add(text3);
		cp.add(JB02);
		cp.add(text2);
		cp.add(JB01);
		cp.setLayout(new FlowLayout());
		
//		MyListnener listnener = new MyListnener();
		JB01.addActionListener(this );	//�����ע�᷽��
		
		
	}
	
//	class MyListnener implements ActionListener{	//����һ���������ķ���
		
		public void actionPerformed(ActionEvent args){
			System.out.println("aaaaaaaa");
		}
		
		
	}
	
