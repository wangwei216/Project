package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;;

public class CharWriteFile {
	/**
	 * 一、字符流，只能是纯文本的
	 *  1. 创建源
	 *  2. 选择流  用reader对象
	 *  3. 创建缓冲数组 如果是字符流就用char类型的数组，要是字节流的话就用byte类型的数组
	 *  	a.还需要定义一个实际的接收长度
	 *  	b.判断什么时候读完
	 *  	c.别忘了强制刷出
	 *  4. 关闭资源
	 *
	 */
	public static void main(String[] args) {
		File src = new File("D:/user/test/test02.txt");
		Writer wr= null;
		try {
			
			wr = new FileWriter(src);
			String str = "我想把这句话写出来========";
			wr.write(str);
			wr.append("在末尾还可以再追加字符");
			wr.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写入失败");
		}
		finally {
			if(null!=wr){
				try {
					wr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
					
				}
			}
		}

	}

}
