package framePratice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyComputer extends JFrame implements ActionListener{
	JTextField jtfNum1 = new JTextField(5);
	JTextField jtfNum2 = new JTextField(5);
	JTextField jtfResult = new JTextField(5);
	JLabel jlAdd = new JLabel("+");
	JButton jbtEquals = new JButton("=");
	public MyComputer(){
		super("º∆À„∆˜");
		//this.setTitle(title);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jtfNum1);
		cp.add(jlAdd);
		cp.add(jtfNum2);
		cp.add(jbtEquals);
		cp.add(jtfResult);
		this.setSize(300,80);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocation(200, 100);
		this.setLocationRelativeTo(null);//æ”÷–œ‘ æ
		
		jbtEquals.addActionListener(this);//◊¢≤·
		jtfResult.setEditable(false);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new MyComputer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = jtfNum1.getText();
		String s2 = jtfNum2.getText();
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		double r = n1+n2;
		jtfResult.setText(String.valueOf(r));
		
	}

}
