package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;

/**
 * һ���ַ�����ֻ���Ǵ��ı���
 *  1. ����Դ
 *  2. ѡ����  ��reader����
 *  3. ������������ ������ַ�������char���͵����飬Ҫ���ֽ����Ļ�����byte���͵�����
 *  	a.����Ҫ����һ��ʵ�ʵĽ��ճ���
 *  	b.�ж�ʲôʱ�����
 *  4. �ر���Դ
 *
 */
public class CharReadFile {
	
	public static void main(String[] args){
		//����Դ
		File src = new File("D:/user/test/test01.txt");
		//ѡ����
		Reader reader = null;
		try {
			reader = new FileReader(src);
			//��ȡ����
			char [] flush =new  char[100];
			int len = 0; //����һ��ʵ�ʵĽ��ճ���
			try {
				if(-1!=(len=reader.read(flush))){
					//�ַ����� ת���ַ���
					String str = new String(flush, 0, len);
					System.out.println(str);
					
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("��ȡ�ļ�ʧ��");
			}
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			System.out.println("�ļ�������");
		}finally {
			if(null!= reader){
				try {
					reader.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
		
	}

}
