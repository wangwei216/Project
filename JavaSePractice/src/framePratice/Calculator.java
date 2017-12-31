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
 *把字符串转化为 double类型需要用 parseDouble这个方法
 *要是想吧任何类型的数据转化为字符串类型的时需要用到 string。valueOf（）；
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
	JButton JB01= new JButton("确定");
	JButton JB02 = new JButton("=");
	JTextField text3 = new JTextField(6);
	JTextField text2 = new JTextField(6);
	JTextField txt = new JTextField(6); //这是空的文本域里面参数是文本域长度
	public Calculator(){
		super("计算器");
		Container cp = this.getContentPane();//方法要放在构造器中
		cp.add(txt);
		cp.add(jLabel);
		cp.add(text3);
		cp.add(JB02);
		cp.add(text2);
		cp.add(JB01);
		cp.setLayout(new FlowLayout());
		
//		MyListnener listnener = new MyListnener();
		JB01.addActionListener(this );	//这个是注册方法
		
		
	}
	
//	class MyListnener implements ActionListener{	//这是一个监听器的方法
		
		public void actionPerformed(ActionEvent args){
			System.out.println("aaaaaaaa");
		}
		
		
	}
	
