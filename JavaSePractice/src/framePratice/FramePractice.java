package framePratice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.nio.channels.NonWritableChannelException;
import java.time.temporal.JulianFields;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.html.parser.ContentModel;


public class FramePractice extends JFrame implements ActionListener{
	
	private  int count=0;

	JLabel jLabel= new JLabel("��ť�����0��");
	JButton JButton = new JButton("����",new ImageIcon("button.jpg"));

	public FramePractice() {
			super("���԰�ť�ĵ������");
		
		Container cp = this.getContentPane();
		getContentPane().setLayout(new FlowLayout());
		
		cp.setLayout(new FlowLayout());
		cp.add(JButton);
		cp.add(jLabel);
		JButton.setToolTipText("����һ����ʾ");
		
		getContentPane().add(JButton);
		getContentPane().add(jLabel);

		
		/**
		 * �ⲿ����Ϊ��ť����һ��������
		 */
		
		JButton.addActionListener(this);
		
		
	}

	/**
	 * �ⲿ����д�Լ������¼��Ĵ�����
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		jLabel.setText("��ť�������"+count+ "��");
		
	}

	
	
}
