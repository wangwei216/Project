package io;


import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.text.FieldPosition;
import java.util.*;
import javax.swing.plaf.FileChooserUI;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * һ�������ļ���
 *  �ȴ���һ��Դͷ·����Ŀ��·��
 * 1. ��֮ǰ�ж��ǲ���һ���ļ����ǵĻ� ֱ����CopyFiles()��Ҫ���ļ��еĻ���Ҫ�ȴ���Ȼ����mkdirs()
 * 2. �ݹ������Ŀ¼
 *
 */
public class CopyDirectory {
	


	public static void main(String[] args){
		String srcPath = "D:/user/test";
		String  desPath = "D:/user/testCopy";
		
		File src = new File(srcPath);
		File  des =null;
		if(src.isDirectory()){
			 des = new File(desPath, src.getName());
		}
		//��������ļ��еĻ� ��ֱ��дһ�����Ʒ���
		try {
			copyFileDetail(src, des);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	//�ļ�Դ����Ҫ���Ƶ�Ŀ�ĵ�
	public  static void  copyFileDetail(File src ,File  des) throws FileNotFoundException {
		if(src.isFile()){
			//������ļ��Ļ������ļ�������
	//		FileUtil.copyFile(src ,des);   ����޷����� 
		}
		else if(src.isDirectory()){
			des.mkdir();
			//��ȡ��һ��Ŀ¼
			for(File sub :src.listFiles()){
				copyFileDetail(sub, new File(des,sub.getName()));
			}
		}
		
	}

}
