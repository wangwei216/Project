package io;

import java.awt.BufferCapabilities.FlipContents;
import java.awt.event.PaintEvent;
import java.io.File;
import java.nio.file.Files;

public class OperateFile {

	/**
	 * һ�� �����ļ�
	 * 1. mkdir()  �����ļ��У������Ŀ¼�����ڵĻ����ͻᴴ��ʧ��
	 * 2. mkdirs() Ҳ�Ǵ����ļ��У� ���������Ŀ¼�����ڵĻ����������д��·��һ��һ�㴴������
	 * 3. list()  ���ǿ��԰���Ŀ¼������ļ���������ʾ������������Ҫ�õ����飬����ı���
	 * 4. files()  ���԰�ͬ��Ŀ¼����������ļ���ǰ·��������ʾ����
	 * 5. FilenameFilter �ļ��������������԰�����Ҫ���ļ��ĺ�׺������ʾ�������������Ҫ��ͷ�õ�ʱ���ڿ���
	 * 
	 */
	public static void main(String[] args){
		String path = "D:/user/test";
		File src = new File(path);
		if(src.isDirectory()){ //�ж��ǲ����ļ���
			
			System.out.println("===�ָ���==");
			String[] subNames = src.list();
			for(String temp : subNames){
				System.out.println(temp);
			}
			
			System.out.println("-----�ָ���---");
			File[] subFiles = src.listFiles();
			for(File temp: subFiles){
				System.out.println(src.getAbsolutePath());
			}
		}
	
	}
}
