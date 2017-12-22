package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 一、字符流，拷贝纯文本的文件夹 
 *  1. 创建源 一个是要拷贝的文件源，另一个是你想拷到哪的目的文件源
 *  2. 选择流  用reader  writer 需要先置空
 *  3. 读文件 先创建一个读文件的对象FileReader和写文件的对象FileWriter  读取文件的时候需要创建缓冲数组 写文件的时候不需要
 *     如果是字符流就用char类型的数组，要是字节流的话就用byte类型的数组
 *  	a.还需要定义一个实际的接收长度
 *  	b.判断什么时候读完(while)，需要用到read方法
 *  	c.别忘了强制刷出
 *  4. 判断是否把要写的文件全部写出来了,如果写完就关闭（后打开的先关闭原则）
 *  5. 关闭资源
 *
 */
public class CharCopyFile {
	

	public static void main(String[] args){
		File src = new File("D:/user/test/test01.txt");
		File des = new File("D:/user/test/test03.txt");
		
		Reader reader = null;
		Writer writer = null;
		
		//先把文件读出来
		try {
			reader = new FileReader(src);
			writer = new FileWriter(des);
			
			char[] flush = new char[100];
			int len= 0;
			while(-1!=(len=reader.read(flush))){ //判断什么时候把文件读完
				writer.write(flush,0,len);
			}
			writer.flush(); //强制刷出
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到文件");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("读取文件失败");
		}
		finally {
			if(null!=writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭失败文件");
				}
			}
		}
		
		
	}

}
