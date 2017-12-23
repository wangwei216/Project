package thread;

public class Dog extends Thread {

	public void run(){
		for(int i =0 ;i<1000;i++){
			System.out.println("小狗>>>>>>走了多少步"+i);
		}
	}

}
