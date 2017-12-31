package framePratice;

public class FramePracticeTest {
	public static void main(String[] args){
		
		FramePractice frame = new FramePractice();
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
	}

}
