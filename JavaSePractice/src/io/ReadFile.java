package io;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.AbstractDocument.LeafElement;

public class ReadFile {
	
	/**
	 * 一、文件的读取  从哪个地方要读的文件地址
	 *  1. 建立一个联系，也就是new一个file对象
	 *  2. 选择流 ， 文件输入输出流 InputSteam FileIntputSteam  这个是字节流
	 *  3. 操作  先new一个缓冲数组，然后进行循环读取
	 *  4. 释放资源
	 * 
	 */
	public static void main(String [] args){
		
//		1. 建立一个联系，也就是new一个file对象
		File src = new File("D:/user/test/test.txt");
//		2. 选择流
		InputStream iStream = null;  //提示作用域
		try {
			 iStream= new FileInputStream("D:/user/test/test01.txt");
//			3. 操作不断读取，创建一个缓冲数组
			 byte [] car = new byte[6]; //每次读取多少个字节
			 int len= 0; //这个是你实际接收读取的字节大小
			 //循环读取
			 while(-1!=(len=iStream.read(car))){
				 //这个需要吧字节数组转成字符串
				 String info = new String(car, 0, len);
				 System.out.println(info);
			 }
			 
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件读取错误");
		}finally {
//			4. 释放资源
			if(null != iStream){
				try {
					iStream.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭资源失败");
				}
			}
		}
		
	}

}
