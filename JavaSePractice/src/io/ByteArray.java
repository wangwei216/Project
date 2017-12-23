package io;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 一、字节数组流
 * 	1. 文件-（用文件输入流）--程序--（字节输出流）-字节数组
 * 
 * 
 *  2， 字节数组-（字节输入流）-程序-（文件输出流）-文件
 *  
 *
 */
public class ByteArray {
	

	public static byte[] getBytesFromFile(String srcPath) throws IOException{
		
		//创建文件源
		File src = new File(srcPath);
		
		//创建字节数组目的地
		byte[] des = null;
		//选择流  用文件输入流  字节输出流
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		// 选择字节输出流
		ByteArrayOutputStream  bos = new ByteArrayOutputStream();
		//操作 不断读取文件 写到字节数组流中
		byte [] flush = new byte[1024];
		int len = 0 ;//定义一个实际接收长度
		
		while(-1!=(len= is.read(flush))){
			//把字节数组里面的数据写出来
			bos.write(flush,0,len);
		}
		//获取数据  把字节数组里面的数据赋值给目的数组
		des = bos.toByteArray();	
		bos.close();
		is.close();
		
		return des;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		byte[] date = getBytesFromFile("D:/user/test/test01.txt");
		System.out.println( new String(date));
		
	}


}
