package tcp_socket;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlPractice {
	
	/**
	 * һ������URL��һЩ�ܽ�
	 *  1. ����URL����
	 *  2. URL��һЩ����
	 *  3. 
	 * 
	 */
	public static void main(String[] args) throws MalformedURLException{
		//�����ʾ����·��
		URL url = new URL("https://github.com/wangwei216##80fd.26");
		
		//�ⲿ�ֱ�ʾ��URL�Ļ��������½���һ�����url �����·��
		System.out.println(url.getHost());
		url= new URL(url,"/adfs.txt");
		System.out.println(url.toString());
		
		System.out.println(url.getProtocol());//�����ʾ�鿴Э��ķ���
		System.out.println(url.getPort()); //�����ʾ�鿴�˿�
		System.out.println(url.getHost()); //�����ʾ�鿴�����ķ�����
		System.out.println(url.getFile()); //��ʾ�鿴��Դ
		System.out.println("�鿴���·��"+  url.getPath());//��ʾ�鿴����·��
		System.out.println("��ê��"+url.getRef());//����ê�㷵��null ��֮
		
	}

}
