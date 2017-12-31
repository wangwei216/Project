package tcp_socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.GenericArrayType;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class FromUrlReadFile {
	
	/**
	 * 一、把一个网址上的源代码输出到控制台
	 * 	1. 用InputStream的流类型（）用openStream)();的方法
	 *  2. 构建一个缓冲数组，定义一个实际接受长度
	 *  3. 用while循环看缓冲数组中是否读完
	 * 	4. 输出到字符串，关闭流
	 * 
	 * 二、实现把一个网址上的源码以流的形式，可以转换成一个文件流（而且不会有乱码，使用了转换流）
	 * 	1. 使用BufferedReader进行解码，创建一个使用默认大小输入缓冲区的缓冲字符输入流
	 * 	2. 使用BufferedWriter进行统一，并且创建文件名
	 * 	3. 循环读取，使用append（）把读取到的字符串添加到BufferedWriter流中
	 */
	public static void main(String[] args) throws IOException{
		
		URL url = new URL("https://www.baidu.com/");
//		
//		System.out.println("协议是："+url.getProtocol());
//		System.out.println("域名"+url.getHost());
//		System.out.println("端口"+url.getPort());
//		System.out.println("资源"+ url.getFile());
//		System.out.println("相对路径"+url.getPath());
//		System.out.println("锚点"+ url.getRef());
		//存在锚点返回null 反之
		/*InputStream is = url.openStream();
		byte[] flush = new byte[1024];
		int len =0;
		while(-1!=(len=is.read(flush))){	
			System.out.println(new String(flush,0,len));
		}
		is.close();
		*/
		//由于编码不统一，容易导致乱码，现在使用转换流来解决
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));//解码的字符集
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		
		String msg = null;
		while(null!=(msg=br.readLine())){ //readLine如果读取完（一个文本行)就返回null
//			System.out.println(msg);
			bw.append(msg); //将指定字符序列添加到 bw中 参数就是你要添加的字符串
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		
		
		
		
	}

}
