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
	 * 一、拷贝文件
	 *  1. 建立一个联系，也就是new一个file对象 （这个是你要写到哪里的文件地址，还有要拷贝的文件源）
	 *  2. 选择流 ， 文件输入输出流 OutputSteam FileOutputSteam  这个是字节流
	 *  3. 操作  先new一个缓冲数组，然后进行循环读取
	 *  4. 释放资源
	 * @throws IOException 
	 *  
	 */
	public static void CopyFile(String scrPath ,String desPath) throws IOException,FileNotFoundException {
//		1. 建立一个联系
		File  src = new File(scrPath);
		File  des = new File(desPath);
//		2. 选择流
		InputStream iStream = new FileInputStream(src);
		OutputStream	osOutputStream = new FileOutputStream(des);
		
		
		
//		3. 建立一个缓冲数组
		byte [] flush =new byte[1024];
		int len = 0 ; //这个是定义一个接受长度
		//读取文件
		while(-1!=(len=iStream.read(flush))){
			//写出文件
			osOutputStream.write(flush, 0, len);
		}
		osOutputStream.flush(); //强制刷出
		//关闭资源
		osOutputStream.close();
		iStream.close();
	}		
	public static void mian(String [] args)  {

		String  src = "D:/user/test/test01.txt";
		String  des = "D:/user/test/test03.txt";
		try {
			CopyFile(src, des);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("拷贝文件失败");
		}
	}		
}
