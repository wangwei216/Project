package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class WriteFile {

	
	/**
	 * 一、写出文件 
	 *  1. 建立一个联系，也就是new一个file对象 （这个是你要写到哪里的文件地址）
	 *  2. 选择流 ， 文件输入输出流 OutputSteam FileOutputSteam  这个是字节流
	 *  3. 操作 建一个你想要写入的string类型的文件 把这个字符串读到你new的那一个缓冲数组，把字符串写进去
	 *     最后别忘了把没有读完的数据刷新出来，最后再finally中用写的方法然后进行循环读取(看看是否把创建的流是否读完)
	 *  4. 释放资源
	 */
	
	public static void main(String[] args) {
//		1. 建立联系
		File des = new File("D:/user/test/test02.txt");
//		2. 选择流
		OutputStream oStream = null;
		try {
			
			oStream = new FileOutputStream(des,true);//以追加的形式写出文件必须为false，
//			3. 操作
			String str = "this si my test，我想要把这句话写到文件中";
			//这个是创建一个缓冲数组,把要写入的字节放进数组中
			byte[] date =str.getBytes();
			oStream.write(date, 0, date.length);
			/**
			 * 这个意思就是把它刷新出去，这个就相当于一个管道，
			 * 如果这个管道不满数据就不会出去，
			 * 用这个就相当于当这个管道不满的时候也可以把数据给推出去
			 */
			oStream.flush();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件没找到");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("写入文件失败");
		}finally {
			if(null != oStream){
				try {
					oStream.close();
				} catch (IOException e) {
				
					e.printStackTrace();
					System.out.println("关闭文件失败");
				}
			}
		}
		


	}

}
