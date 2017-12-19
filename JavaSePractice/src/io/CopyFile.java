package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.Finishings;

public class CopyFile {
	
	/**
	 * 一、输入输出流
	 *  1. fileinputerStream  和 FileOutputStream 用于字节流 只能
	 *  2. FileWriter 和FileReader 用于字符流
	 * 二、 文本流
	 *  1.PrintStream() 这个输出流可以在FileOuterStream的基础上把各种类型的数据打印到文本上
	 * 三、 缓冲流
	 *  
	 */
	public static void mian(String [] args) {
		
		try {
			FileInputStream fileInputStream  = new FileInputStream("D:/user/test/test01.txt");
			
			FileOutputStream fileOutputStream = new FileOutputStream("D:/user/test/test02.txt");
			int r=-1;
			while(true){
				r=fileInputStream.read();
				if(r==-1){
					break;
				}
				fileOutputStream.write(r);
			}
			fileInputStream.close();
			fileOutputStream.close();
			
			
		} catch ( Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}
