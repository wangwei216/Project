package jpanelPractice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.CollectionCertStoreParameters;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PracticeDIalog  extends JFrame implements ActionListener{
	
	JButton  jButton1 = new JButton("消息");
	JButton  jButton2 = new JButton("删除");
	
	public PracticeDIalog(){
		Container cp = this.getContentPane() ;
		cp.setLayout(new FlowLayout());
		cp.add(jButton1);
		cp.add(jButton2);
		jButton1.addActionListener(this );
		jButton2.addActionListener(this);
		
		
	}

	public static void main(String[] args){
		
		PracticeDIalog frame = new PracticeDIalog();
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jButton1){
			JOptionPane.showMessageDialog(null,"弹出消息对话框");
		}
		if(e.getSource()==jButton2){
			
			int a = JOptionPane.showConfirmDialog(null,"是否删除","删除",
					JOptionPane.YES_NO_OPTION);
		}
		
		int a = 0 ;
		if(a ==JOptionPane.YES_NO_OPTION){
			JOptionPane.showMessageDialog(null, "删除成功！");
		}
	}
}
