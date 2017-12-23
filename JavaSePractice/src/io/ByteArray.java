package io;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * һ���ֽ�������
 * 	1. �ļ�-�����ļ���������--����--���ֽ��������-�ֽ�����
 * 
 * 
 *  2�� �ֽ�����-���ֽ���������-����-���ļ��������-�ļ�
 *  
 *
 */
public class ByteArray {
	

	public static byte[] getBytesFromFile(String srcPath) throws IOException{
		
		//�����ļ�Դ
		File src = new File(srcPath);
		
		//�����ֽ�����Ŀ�ĵ�
		byte[] des = null;
		//ѡ����  ���ļ�������  �ֽ������
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		// ѡ���ֽ������
		ByteArrayOutputStream  bos = new ByteArrayOutputStream();
		//���� ���϶�ȡ�ļ� д���ֽ���������
		byte [] flush = new byte[1024];
		int len = 0 ;//����һ��ʵ�ʽ��ճ���
		
		while(-1!=(len= is.read(flush))){
			//���ֽ��������������д����
			bos.write(flush,0,len);
		}
		//��ȡ����  ���ֽ�������������ݸ�ֵ��Ŀ������
		des = bos.toByteArray();	
		bos.close();
		is.close();
		
		return des;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		byte[] date = getBytesFromFile("D:/user/test/test01.txt");
		System.out.println( new String(date));
		
	}


}
