package thread;

/**
 * 第二种方式是实现多线程的（静态代理，引用真实代理角色）
 * 
 * 一、代理线程(用一个抢票小程序简单的测试一下)
 * 	1，让类实现runable 的接口就可以实现代理
 * 	2.重写run方法，使用静态代理角色 加上真是角色的引用，调用start方法
 *
 *第三种实现多线程的方式（通过Callable接口实现多线程）
 *	优点：
 *	1. 可以获取返回值
 *	2. 还可以声明异常
 *	缺点：比较繁琐
 *	
 */
public class AgentThread implements Runnable{

	private int Number = 50;
	
	@Override
	public void run() {
		while(true){
			if(Number< 0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"我抢到票了 "+ Number--);
		}
		
	}
	
	public static void main(String[] args){
		//真是角色
		AgentThread boss = new AgentThread();
		//代理角色
		Thread t1= new Thread(boss,"代理人01"); //参数1是真实代理角色，参数2是代理角色的名称
		Thread t2 = new Thread(boss,"黄牛");
		Thread t3 = new Thread(boss,"工程师 ");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
