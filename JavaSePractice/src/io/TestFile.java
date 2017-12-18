package io;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import javax.script.ScriptContext;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 一、 常量 ：
 * 1. 路径分隔符 :  separator
 * 2. 文件分隔符 \(windons)  pathSeparator
 * 3. 只要有盘符就是绝对路径，否则就是其他
 *二、判断信息
 * 1. 判断一个文件是否可以写或读，还可以判断是不是一个文件夹，而且文件夹不可写
 * 2. 判断一个文件的长度是看他的字节长度，不是看所占用的内存长度
 * 3. 创建一个文件夹，先判断这个文件夹是否存在，还需要考虑创建失败和成功的情况
 * 
 */
public class TestFile {
	
	
	public static void  main(String[] args) {
		
		try {
			Test();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
		File src= new File("D:/user/test.txt");
		if(src.exists()){
			System.out.println("看看是否存在："+ src);
		}
		System.out.println(File.separator);    
		System.out.println(File.pathSeparator);  
		System.out.println(src.getAbsolutePath()); //返回的是绝对路径
		System.out.println(src.getPath());			//如果是绝对撸经的话就会返回完整路径
		System.out.println(src.getName());
		System.out.println(src.getParentFile());  //返回的是上一级目录，如果是想对你路径  就会返回null
	}
	
	public static void Test() throws IOException {
		
//		File src1 = new File("")
		String path = "D:/user/test01.txt";
		File src1 = new File(path);
		if(!src1.exists()){

		boolean  flag = src1.createNewFile();
	
		System.out.println(flag?"成功":"失败");
		
		}
	}

}
