package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;

/**
 * 一、字符流，只能是纯文本的
 *  1. 创建源
 *  2. 选择流  用reader对象
 *  3. 创建缓冲数组 如果是字符流就用char类型的数组，要是字节流的话就用byte类型的数组
 *  	a.还需要定义一个实际的接收长度
 *  	b.判断什么时候读完
 *  4. 关闭资源
 *
 */
public class CharReadFile {
	
	public static void main(String[] args){
		//创建源
		File src = new File("D:/user/test/test01.txt");
		//选择流
		Reader reader = null;
		try {
			reader = new FileReader(src);
			//读取操作
			char [] flush =new  char[100];
			int len = 0; //定义一个实际的接收长度
			try {
				if(-1!=(len=reader.read(flush))){
					//字符数组 转成字符串
					String str = new String(flush, 0, len);
					System.out.println(str);
					
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("读取文件失败");
			}
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			System.out.println("文件不存在");
		}finally {
			if(null!= reader){
				try {
					reader.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
		
	}

}
