package planeUtil;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class MyFrame extends Frame {
	
	
	
	public void launchFrame(){  //����һ�����ش��ڵķ���
		setSize(Constant.GAME_HEIGHT, Constant.GAME_WIDTH); //��������õĴ��ڵĴ�С
		setLocation(200, 200);  //����Ǵ��ڵĵ�����
		setVisible(true);  //��Ҫ�Ѵ������ó�Ϊ�ɼ���
		
		new PaintThread().start(); //����������߳�
		
		addWindowListener(new WindowAdapter() { //����һ���ڲ���Դ��ڵļ������󣬿����Ǵ��ڿ����˳�

			@Override
			public void windowClosing(WindowEvent e) {  //����Ƕ�windowClosing������д
				System.exit(0);
			}  
			
		});
		
		addWindowListener(new WindowAdapter() { //����һ���ڲ���Դ��ڵļ������󣬿����Ǵ��ڿ����˳�

			@Override
			public void windowClosing(WindowEvent e) {  //����Ƕ�windowClosing������д
				System.exit(0);
			}  
			
		});

	}

	
	 class PaintThread extends Thread{
			public void run(){
				while (true){
					repaint();
					try {
						Thread.sleep(40); //1s ����1000ms  Ҳ����һ������ظ���25�δ���
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
				}
			}
			
			
		}
	
}
	
	
	
