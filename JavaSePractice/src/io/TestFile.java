package io;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import javax.script.ScriptContext;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * һ�� ���� ��
 * 1. ·���ָ��� :  separator
 * 2. �ļ��ָ��� \(windons)  pathSeparator
 * 3. ֻҪ���̷����Ǿ���·���������������
 *�����ж���Ϣ
 * 1. �ж�һ���ļ��Ƿ����д������������ж��ǲ���һ���ļ��У������ļ��в���д
 * 2. �ж�һ���ļ��ĳ����ǿ������ֽڳ��ȣ����ǿ���ռ�õ��ڴ泤��
 * 3. ����һ���ļ��У����ж�����ļ����Ƿ���ڣ�����Ҫ���Ǵ���ʧ�ܺͳɹ������
 * 
 */
public class TestFile {
	
	
	public static void  main(String[] args) {
		
		try {
			Test();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		
		File src= new File("D:/user/test.txt");
		if(src.exists()){
			System.out.println("�����Ƿ���ڣ�"+ src);
		}
		System.out.println(File.separator);    
		System.out.println(File.pathSeparator);  
		System.out.println(src.getAbsolutePath()); //���ص��Ǿ���·��
		System.out.println(src.getPath());			//����Ǿ���ߣ���Ļ��ͻ᷵������·��
		System.out.println(src.getName());
		System.out.println(src.getParentFile());  //���ص�����һ��Ŀ¼������������·��  �ͻ᷵��null
	}
	
	public static void Test() throws IOException {
		
//		File src1 = new File("")
		String path = "D:/user/test01.txt";
		File src1 = new File(path);
		if(!src1.exists()){

		boolean  flag = src1.createNewFile();
	
		System.out.println(flag?"�ɹ�":"ʧ��");
		
		}
	}

}
