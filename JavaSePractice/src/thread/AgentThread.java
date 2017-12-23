package thread;

/**
 * �ڶ��ַ�ʽ��ʵ�ֶ��̵߳ģ���̬����������ʵ�����ɫ��
 * 
 * һ�������߳�(��һ����ƱС����򵥵Ĳ���һ��)
 * 	1������ʵ��runable �ĽӿھͿ���ʵ�ִ���
 * 	2.��дrun������ʹ�þ�̬�����ɫ �������ǽ�ɫ�����ã�����start����
 *
 *������ʵ�ֶ��̵߳ķ�ʽ��ͨ��Callable�ӿ�ʵ�ֶ��̣߳�
 *	�ŵ㣺
 *	1. ���Ի�ȡ����ֵ
 *	2. �����������쳣
 *	ȱ�㣺�ȽϷ���
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
