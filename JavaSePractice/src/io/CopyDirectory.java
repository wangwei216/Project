package io;


import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.text.FieldPosition;
import java.util.*;
import javax.swing.plaf.FileChooserUI;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 一、拷贝文件夹
 *  先创建一个源头路径和目的路径
 * 1. 考之前判断是不是一个文件，是的话 直接用CopyFiles()，要是文件夹的话需要先创建然后复制mkdirs()
 * 2. 递归查找子目录
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
		//如果不是文件夹的话 就直接写一个复制方法
		try {
			copyFileDetail(src, des);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	//文件源和你要复制的目的地
	public  static void  copyFileDetail(File src ,File  des) throws FileNotFoundException {
		if(src.isFile()){
			//如果是文件的话就用文件工具类
	//		FileUtil.copyFile(src ,des);   这个无法导入 
		}
		else if(src.isDirectory()){
			des.mkdir();
			//获取下一级目录
			for(File sub :src.listFiles()){
				copyFileDetail(sub, new File(des,sub.getName()));
			}
		}
		
	}

}
