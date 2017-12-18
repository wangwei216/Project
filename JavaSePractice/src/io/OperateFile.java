package io;

import java.awt.BufferCapabilities.FlipContents;
import java.awt.event.PaintEvent;
import java.io.File;
import java.nio.file.Files;

public class OperateFile {

	/**
	 * 一、 操作文件
	 * 1. mkdir()  创建文件夹，如果父目录不存在的话，就会创建失败
	 * 2. mkdirs() 也是创建文件夹， 但是如果父目录不存在的话，他会把你写的路径一层一层创建出来
	 * 3. list()  就是可以把字目录里面的文件名都能显示出来，但是需要用到数组，数组的遍历
	 * 4. files()  可以把同级目录下面的所有文件当前路径都能显示出来
	 * 5. FilenameFilter 文件名过滤器，可以把你想要的文件的后缀名给显示出来（如果有需要回头用的时候在看）
	 * 
	 */
	public static void main(String[] args){
		String path = "D:/user/test";
		File src = new File(path);
		if(src.isDirectory()){ //判断是不是文件夹
			
			System.out.println("===分割线==");
			String[] subNames = src.list();
			for(String temp : subNames){
				System.out.println(temp);
			}
			
			System.out.println("-----分割线---");
			File[] subFiles = src.listFiles();
			for(File temp: subFiles){
				System.out.println(src.getAbsolutePath());
			}
		}
	
	}
}
