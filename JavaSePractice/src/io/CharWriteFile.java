package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;;

public class CharWriteFile {
	/**
	 * һ���ַ�����ֻ���Ǵ��ı���
	 *  1. ����Դ
	 *  2. ѡ����  ��reader����
	 *  3. ������������ ������ַ�������char���͵����飬Ҫ���ֽ����Ļ�����byte���͵�����
	 *  	a.����Ҫ����һ��ʵ�ʵĽ��ճ���
	 *  	b.�ж�ʲôʱ�����
	 *  	c.������ǿ��ˢ��
	 *  4. �ر���Դ
	 *
	 */
	public static void main(String[] args) {
		File src = new File("D:/user/test/test02.txt");
		Writer wr= null;
		try {
			
			wr = new FileWriter(src);
			String str = "�������仰д����========";
			wr.write(str);
			wr.append("��ĩβ��������׷���ַ�");
			wr.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("д��ʧ��");
		}
		finally {
			if(null!=wr){
				try {
					wr.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
					
				}
			}
		}

	}

}
