package thread;

/**
 * 一、线程的run方法和start方法的区别
 * 	1. run方法就是指要等前一个线程结束之后才能继续下一个线程，而start方法就是不用等上一个线程结束之后就可以同时进行
 * 
 */


public class rabbit extends Thread {

	
	
	public void run(){
		for(int i =0 ;i<100;i++){
			System.out.println("兔子  ++++走了多少步"+i);
		}
	}
	

	
	public static void main(String[] args) {
		
		 rabbit rabbit = new  rabbit();
		 Dog dog = new Dog();
				
		 //如果要是调用run方法的话就会先执行一个线程之后再去调用另一个线程
		rabbit.start();
		dog.start();

	}

}
