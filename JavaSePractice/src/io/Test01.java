package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.nio.channels.NonWritableChannelException;
import java.io.OutputStream;

import javax.print.attribute.standard.MediaSize.Other;

/**
 * @author user
 *��ȡ�ļ���
 *1, ������ϵ
 *2. ѡ����
 *3. ����
 *	=����һ����������
 *	=����һ��ʵ�ʴ��䳤��
 *
 *4. �ر���
 *
 * * һ��д���ļ� 
	 *  1. ����һ����ϵ��Ҳ����newһ��file���� ���������Ҫд��������ļ���ַ��
	 *  2. ѡ���� �� �ļ���������� OutputSteam FileOutputSteam  ������ֽ���
	 *  3. ���� ��һ������Ҫд���string���͵��ļ� ������ַ���������new����һ���������飬�����Ǹ�dateд���㴴��������ȥ
	 *     �������˰�û�ж��������ˢ�³����������finally����д�ķ���Ȼ�����ѭ����ȡ
	 *  4. �ͷ���Դ
 */
public class Test01 {
	
	
	public static void main(String[] args){
		
		File des = new File("D:/user/test/test04.txt");
		OutputStream outputStream = null;
		
		try {
			outputStream = new FileOutputStream(des);
			String str = "�����ҽ���java�������仰�����ļ�4��  = wobuuguan fanzhong woaini hahah ";
			byte[] date =  str.getBytes();
			outputStream.write(date, 0, date.length);
			
			outputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ�û�ҵ�");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if(null!=outputStream){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
