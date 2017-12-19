package io;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.AbstractDocument.LeafElement;

public class ReadFile {
	
	/**
	 * һ���ļ��Ķ�ȡ  ���ĸ��ط�Ҫ�����ļ���ַ
	 *  1. ����һ����ϵ��Ҳ����newһ��file����
	 *  2. ѡ���� �� �ļ���������� InputSteam FileIntputSteam  ������ֽ���
	 *  3. ����  ��newһ���������飬Ȼ�����ѭ����ȡ
	 *  4. �ͷ���Դ
	 * 
	 */
	public static void main(String [] args){
		
//		1. ����һ����ϵ��Ҳ����newһ��file����
		File src = new File("D:/user/test/test.txt");
//		2. ѡ����
		InputStream iStream = null;  //��ʾ������
		try {
			 iStream= new FileInputStream("D:/user/test/test01.txt");
//			3. �������϶�ȡ������һ����������
			 byte [] car = new byte[6]; //ÿ�ζ�ȡ���ٸ��ֽ�
			 int len= 0; //�������ʵ�ʽ��ն�ȡ���ֽڴ�С
			 //ѭ����ȡ
			 while(-1!=(len=iStream.read(car))){
				 //�����Ҫ���ֽ�����ת���ַ���
				 String info = new String(car, 0, len);
				 System.out.println(info);
			 }
			 
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ���ȡ����");
		}finally {
//			4. �ͷ���Դ
			if(null != iStream){
				try {
					iStream.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("�ر���Դʧ��");
				}
			}
		}
		
	}

}
