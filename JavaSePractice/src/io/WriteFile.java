package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class WriteFile {

	
	/**
	 * һ��д���ļ� 
	 *  1. ����һ����ϵ��Ҳ����newһ��file���� ���������Ҫд��������ļ���ַ��
	 *  2. ѡ���� �� �ļ���������� OutputSteam FileOutputSteam  ������ֽ���
	 *  3. ���� ��һ������Ҫд���string���͵��ļ� ������ַ���������new����һ���������飬���ַ���д��ȥ
	 *     �������˰�û�ж��������ˢ�³����������finally����д�ķ���Ȼ�����ѭ����ȡ(�����Ƿ�Ѵ��������Ƿ����)
	 *  4. �ͷ���Դ
	 */
	
	public static void main(String[] args) {
//		1. ������ϵ
		File des = new File("D:/user/test/test02.txt");
//		2. ѡ����
		OutputStream oStream = null;
		try {
			
			oStream = new FileOutputStream(des,true);//��׷�ӵ���ʽд���ļ�����Ϊfalse��
//			3. ����
			String str = "this si my test������Ҫ����仰д���ļ���";
			//����Ǵ���һ����������,��Ҫд����ֽڷŽ�������
			byte[] date =str.getBytes();
			oStream.write(date, 0, date.length);
			/**
			 * �����˼���ǰ���ˢ�³�ȥ��������൱��һ���ܵ���
			 * �������ܵ��������ݾͲ����ȥ��
			 * ��������൱�ڵ�����ܵ�������ʱ��Ҳ���԰����ݸ��Ƴ�ȥ
			 */
			oStream.flush();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�û�ҵ�");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("д���ļ�ʧ��");
		}finally {
			if(null != oStream){
				try {
					oStream.close();
				} catch (IOException e) {
				
					e.printStackTrace();
					System.out.println("�ر��ļ�ʧ��");
				}
			}
		}
		


	}

}
