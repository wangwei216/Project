package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.attribute.standard.Finishings;
import javax.print.attribute.standard.MediaSize.ISO;

public class CopyFile {
	
	/**
	 * һ�������ļ�
	 *  1. ����һ����ϵ��Ҳ����newһ��file���� ���������Ҫд��������ļ���ַ������Ҫ�������ļ�Դ��
	 *  2. ѡ���� �� �ļ���������� OutputSteam FileOutputSteam  ������ֽ���
	 *  3. ����  ��newһ���������飬Ȼ�����ѭ����ȡ
	 *  4. �ͷ���Դ
	 * @throws IOException 
	 *  
	 */
	public static void CopyFile(String scrPath ,String desPath) throws IOException,FileNotFoundException {
//		1. ����һ����ϵ
		File  src = new File(scrPath);
		File  des = new File(desPath);
//		2. ѡ����
		InputStream iStream = new FileInputStream(src);
		OutputStream	osOutputStream = new FileOutputStream(des);
		
		
		
//		3. ����һ����������
		byte [] flush =new byte[1024];
		int len = 0 ; //����Ƕ���һ�����ܳ���
		//��ȡ�ļ�
		while(-1!=(len=iStream.read(flush))){
			//д���ļ�
			osOutputStream.write(flush, 0, len);
		}
		osOutputStream.flush(); //ǿ��ˢ��
		//�ر���Դ
		osOutputStream.close();
		iStream.close();
	}		
	public static void mian(String [] args)  {

		String  src = "D:/user/test/test01.txt";
		String  des = "D:/user/test/test03.txt";
		try {
			CopyFile(src, des);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�����ļ�ʧ��");
		}
	}		
}
