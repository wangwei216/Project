package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.Finishings;

public class CopyFile {
	
	/**
	 * һ�����������
	 *  1. fileinputerStream  �� FileOutputStream �����ֽ��� ֻ��
	 *  2. FileWriter ��FileReader �����ַ���
	 * ���� �ı���
	 *  1.PrintStream() ��������������FileOuterStream�Ļ����ϰѸ������͵����ݴ�ӡ���ı���
	 * ���� ������
	 *  
	 */
	public static void mian(String [] args) {
		
		try {
			FileInputStream fileInputStream  = new FileInputStream("D:/user/test/test01.txt");
			
			FileOutputStream fileOutputStream = new FileOutputStream("D:/user/test/test02.txt");
			int r=-1;
			while(true){
				r=fileInputStream.read();
				if(r==-1){
					break;
				}
				fileOutputStream.write(r);
			}
			fileInputStream.close();
			fileOutputStream.close();
			
			
		} catch ( Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}
