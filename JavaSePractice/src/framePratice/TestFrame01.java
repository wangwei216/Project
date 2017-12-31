package framePratice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.security.sasl.RealmCallback;
import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.CORBA.FREE_MEM;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestFrame01 {

	public static void main(String[] args){
		Frame01 frame = new Frame01();
//		frame.getContentPane(); //这是设置一个流动性的布局，先按列排放
		
		
		
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
}
