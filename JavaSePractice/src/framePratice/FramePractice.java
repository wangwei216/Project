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

	JLabel jLabel= new JLabel("按钮点击了0次");
	JButton JButton = new JButton("点我",new ImageIcon("button.jpg"));

	public FramePractice() {
			super("测试按钮的点击次数");
		
		Container cp = this.getContentPane();
		getContentPane().setLayout(new FlowLayout());
		
		cp.setLayout(new FlowLayout());
		cp.add(JButton);
		cp.add(jLabel);
		JButton.setToolTipText("这是一个提示");
		
		getContentPane().add(JButton);
		getContentPane().add(jLabel);

		
		/**
		 * 这部分是为按钮设置一个监听器
		 */
		
		JButton.addActionListener(this);
		
		
	}

	/**
	 * 这部分是写对监听器事件的处理方法
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		jLabel.setText("按钮被点击了"+count+ "次");
		
	}

	
	
}
