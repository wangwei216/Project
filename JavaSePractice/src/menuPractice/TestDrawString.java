package menuPractice;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestDrawString extends JFrame {

	public TestDrawString(){
		super("»­°å");
		this.getContentPane().add(new MyPanel());
		
	}
	
	public static void main(String[] args){
		TestDrawString frame = new TestDrawString();
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Hello World!!!",20,30);
	}
}