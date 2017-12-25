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
 *读取文件流
 *1, 建立联系
 *2. 选择流
 *3. 操作
 *	=建立一个缓冲数组
 *	=定义一个实际传输长度
 *
 *4. 关闭流
 *
 * * 一、写出文件 
	 *  1. 建立一个联系，也就是new一个file对象 （这个是你要写到哪里的文件地址）
	 *  2. 选择流 ， 文件输入输出流 OutputSteam FileOutputSteam  这个是字节流
	 *  3. 操作 建一个你想要写入的string类型的文件 把这个字符串读到你new的那一个缓冲数组，把你那个date写到你创建的流中去
	 *     最后别忘了把没有读完的数据刷新出来，最后再finally中用写的方法然后进行循环读取
	 *  4. 释放资源
 */
public class Test01 {
	
	
	public static void main(String[] args){
		
		File des = new File("D:/user/test/test04.txt");
		OutputStream outputStream = null;
		
		try {
			outputStream = new FileOutputStream(des);
			String str = "这是我今天java课想吧这句话读到文件4中  = wobuuguan fanzhong woaini hahah ";
			byte[] date =  str.getBytes();
			outputStream.write(date, 0, date.length);
			
			outputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件没找到");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(null!=outputStream){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
