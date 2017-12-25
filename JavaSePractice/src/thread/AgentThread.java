package thread;

/**
 * 
 * һ�� �����̵߳����ַ�ʽ���ص㣩
 * 
 * 	�١������߳�(��һ����ƱС����򵥵Ĳ���һ��)
 * 		1������ʵ��runable �ĽӿھͿ���ʵ�ִ���
 * 		2. ��дrun������ʹ�þ�̬�����ɫ �������ǽ�ɫ�����ã�����start����
 *	�ڡ��ڶ��ַ�ʽ��ʵ�ֶ��̵߳ģ���̬����������ʵ�����ɫ��
 * 		1. ����ʵ��runable �ĽӿھͿ���ʵ�ִ���
 * 		2. ��дrun������ʹ�þ�̬�����ɫ �������ǽ�ɫ�����ã�����start����
 * 	�ۡ�������ʵ�ֶ��̵߳ķ�ʽ��ͨ��Callable�ӿ�ʵ�ֶ��̣߳�
 *		�ŵ㣺
 *		1. ���Ի�ȡ����ֵ
 *		2. �����������쳣
 *		ȱ�㣺�ȽϷ���
 *
 *���� �̵߳�״̬��ֹͣ���ص㣩
 *	
 *	1. �̵߳�״̬�� ����--start--����--����--����--��ֹ
 *	2. ��ֹ�̣߳��ص����������ѧһ��, �ٽ��в��䣩
 *
 *
 *	3.���� join������Ǻϲ��̣߳�yield ����ͣ�����ó�CPU�ĵ��ȣ� sleep����ס�߳���Ϣ�����ȴ��̻߳���һ��wait�������ͷ�����
 *
 *
 *�����̵߳����ȼ�������ָ�ĸ��̵߳ľ������ȣ�����ָ����߳�ִ�еĸ��ʱȽϴ�
 *
 *	1. ���������ȼ��Ļ�Ĭ����5, �������ȼ�����һ������ MAX_PRIORITY (10) MIN_PRIORITY(1) NORM_PRIORITY(5)
 *
 *�ġ��̵߳�ͬ��
 *
 *	1. ��Ҫ�õ�synchronize() ��������������(���ñ�������ǰthis������.class)�������������̰߳�ȫ������Ч�ʵ�
 *	2. �����ͬ������synchronize() ���ܻ��������
 *	
 *�塢�������
 *
 *	1. ��ʵ����ʹ��һ��timer()  schedule()�ķ���ʹ��
 */
public class AgentThread implements Runnable{

	private int Number = 50;
	
	@Override
	public void run() {
		while(true){
			if(Number< 0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"������Ʊ�� "+ Number--);
		}
		
	}
	
	public static void main(String[] args){
		//���ǽ�ɫ
		AgentThread boss = new AgentThread();
		//�����ɫ
		Thread t1= new Thread(boss,"������01"); //����1����ʵ�����ɫ������2�Ǵ����ɫ������
		Thread t2 = new Thread(boss,"��ţ");
		Thread t3 = new Thread(boss,"����ʦ ");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
