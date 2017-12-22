package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * һ���ַ������������ı����ļ��� 
 *  1. ����Դ һ����Ҫ�������ļ�Դ����һ�������뿽���ĵ�Ŀ���ļ�Դ
 *  2. ѡ����  ��reader  writer ��Ҫ���ÿ�
 *  3. ���ļ� �ȴ���һ�����ļ��Ķ���FileReader��д�ļ��Ķ���FileWriter  ��ȡ�ļ���ʱ����Ҫ������������ д�ļ���ʱ����Ҫ
 *     ������ַ�������char���͵����飬Ҫ���ֽ����Ļ�����byte���͵�����
 *  	a.����Ҫ����һ��ʵ�ʵĽ��ճ���
 *  	b.�ж�ʲôʱ�����(while)����Ҫ�õ�read����
 *  	c.������ǿ��ˢ��
 *  4. �ж��Ƿ��Ҫд���ļ�ȫ��д������,���д��͹رգ���򿪵��ȹر�ԭ��
 *  5. �ر���Դ
 *
 */
public class CharCopyFile {
	

	public static void main(String[] args){
		File src = new File("D:/user/test/test01.txt");
		File des = new File("D:/user/test/test03.txt");
		
		Reader reader = null;
		Writer writer = null;
		
		//�Ȱ��ļ�������
		try {
			reader = new FileReader(src);
			writer = new FileWriter(des);
			
			char[] flush = new char[100];
			int len= 0;
			while(-1!=(len=reader.read(flush))){ //�ж�ʲôʱ����ļ�����
				writer.write(flush,0,len);
			}
			writer.flush(); //ǿ��ˢ��
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�Ҳ����ļ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("��ȡ�ļ�ʧ��");
		}
		finally {
			if(null!=writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("�ر�ʧ���ļ�");
				}
			}
		}
		
		
	}

}
