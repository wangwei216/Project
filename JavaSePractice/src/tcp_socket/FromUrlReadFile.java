package tcp_socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.GenericArrayType;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class FromUrlReadFile {
	
	/**
	 * һ����һ����ַ�ϵ�Դ�������������̨
	 * 	1. ��InputStream�������ͣ�����openStream)();�ķ���
	 *  2. ����һ���������飬����һ��ʵ�ʽ��ܳ���
	 *  3. ��whileѭ���������������Ƿ����
	 * 	4. ������ַ������ر���
	 * 
	 * ����ʵ�ְ�һ����ַ�ϵ�Դ����������ʽ������ת����һ���ļ��������Ҳ��������룬ʹ����ת������
	 * 	1. ʹ��BufferedReader���н��룬����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ�������
	 * 	2. ʹ��BufferedWriter����ͳһ�����Ҵ����ļ���
	 * 	3. ѭ����ȡ��ʹ��append�����Ѷ�ȡ�����ַ�����ӵ�BufferedWriter����
	 */
	public static void main(String[] args) throws IOException{
		
		URL url = new URL("https://www.baidu.com/");
//		
//		System.out.println("Э���ǣ�"+url.getProtocol());
//		System.out.println("����"+url.getHost());
//		System.out.println("�˿�"+url.getPort());
//		System.out.println("��Դ"+ url.getFile());
//		System.out.println("���·��"+url.getPath());
//		System.out.println("ê��"+ url.getRef());
		//����ê�㷵��null ��֮
		/*InputStream is = url.openStream();
		byte[] flush = new byte[1024];
		int len =0;
		while(-1!=(len=is.read(flush))){	
			System.out.println(new String(flush,0,len));
		}
		is.close();
		*/
		//���ڱ��벻ͳһ�����׵������룬����ʹ��ת���������
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));//������ַ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		
		String msg = null;
		while(null!=(msg=br.readLine())){ //readLine�����ȡ�꣨һ���ı���)�ͷ���null
//			System.out.println(msg);
			bw.append(msg); //��ָ���ַ�������ӵ� bw�� ����������Ҫ��ӵ��ַ���
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		
		
		
		
	}

}
