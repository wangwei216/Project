package thread;

/**
 * һ���̵߳�run������start����������
 * 	1. run��������ָҪ��ǰһ���߳̽���֮����ܼ�����һ���̣߳���start�������ǲ��õ���һ���߳̽���֮��Ϳ���ͬʱ����
 * 
 */


public class rabbit extends Thread {

	
	
	public void run(){
		for(int i =0 ;i<100;i++){
			System.out.println("����  ++++���˶��ٲ�"+i);
		}
	}
	

	
	public static void main(String[] args) {
		
		 rabbit rabbit = new  rabbit();
		 Dog dog = new Dog();
				
		 //���Ҫ�ǵ���run�����Ļ��ͻ���ִ��һ���߳�֮����ȥ������һ���߳�
		rabbit.start();
		dog.start();

	}

}
