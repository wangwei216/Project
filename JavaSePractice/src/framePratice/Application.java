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

	JButton jButton01 = new JButton("计算平方");
	JTextField jTextField01 = new JTextField(5);
	JTextField jTextField02 = new JTextField(5);
	
	
	public Application(){
		super("计算一个的平方");
		Container cp = this.getContentPane();//创建一个该对象的内容表格
		cp.setLayout(new FlowLayout());		//先添加一个容器，然后在设置排列方式
		
		cp.add(jTextField01);
		cp.add(jButton01);
		cp.add(jTextField02);
		/**
		 * 这部分是注册监听器
		 */
		jTextField01.addActionListener(this);
		jButton01.addActionListener(this);
		jTextField02.setEditable(false); //可以设置成补课编辑的形式
	}


/**
 * 这部分是事件的处理方法
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = jTextField01.getText();
		
		double f = Double.parseDouble(s1); 
		double result = f*f;
		jTextField02.setText(String.valueOf(result));
	}
}
