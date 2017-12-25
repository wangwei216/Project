package thread;

/**
 * 
 * 一、 创建线程的三种方式（重点）
 * 
 * 	①、代理线程(用一个抢票小程序简单的测试一下)
 * 		1，让类实现runable 的接口就可以实现代理
 * 		2. 重写run方法，使用静态代理角色 加上真是角色的引用，调用start方法
 *	②、第二种方式是实现多线程的（静态代理，引用真实代理角色）
 * 		1. 让类实现runable 的接口就可以实现代理
 * 		2. 重写run方法，使用静态代理角色 加上真是角色的引用，调用start方法
 * 	③、第三种实现多线程的方式（通过Callable接口实现多线程）
 *		优点：
 *		1. 可以获取返回值
 *		2. 还可以声明异常
 *		缺点：比较繁琐
 *
 *二、 线程的状态和停止（重点）
 *	
 *	1. 线程的状态： 新生--start--就绪--运行--阻塞--终止
 *	2. 终止线程（重点后期再重新学一遍, 再进行补充）
 *
 *
 *	3.阻塞 join（这个是合并线程）yield （暂停或者让出CPU的调度） sleep（抱住线程休息）而等待线程还有一个wait（他是释放锁）
 *
 *
 *三、线程的优先级（不是指哪个线程的绝对优先，而是指这个线程执行的概率比较大）
 *
 *	1. 不设置优先级的话默认是5, 设置优先级就是一个常量 MAX_PRIORITY (10) MIN_PRIORITY(1) NORM_PRIORITY(5)
 *
 *四、线程的同步
 *
 *	1. 需要用到synchronize() 方法，可以锁定(引用变量、当前this对象、类.class)，这样可以让线程安全，但是效率低
 *	2. 过多的同步方法synchronize() 可能会造成死锁
 *	
 *五、任务调度
 *
 *	1. 其实就是使用一个timer()  schedule()的方法使用
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
