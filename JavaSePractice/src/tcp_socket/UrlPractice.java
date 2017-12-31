package tcp_socket;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlPractice {
	
	/**
	 * 一、关于URL的一些总结
	 *  1. 创建URL对象
	 *  2. URL的一些方法
	 *  3. 
	 * 
	 */
	public static void main(String[] args) throws MalformedURLException{
		//这个表示绝对路径
		URL url = new URL("https://github.com/wangwei216##80fd.26");
		
		//这部分表示在URL的基础上重新建了一个相对url 的相对路径
		System.out.println(url.getHost());
		url= new URL(url,"/adfs.txt");
		System.out.println(url.toString());
		
		System.out.println(url.getProtocol());//这个表示查看协议的方法
		System.out.println(url.getPort()); //这个表示查看端口
		System.out.println(url.getHost()); //这个表示查看域名的方方法
		System.out.println(url.getFile()); //表示查看资源
		System.out.println("查看相对路径"+  url.getPath());//表示查看绝对路径
		System.out.println("看锚点"+url.getRef());//存在锚点返回null 反之
		
	}

}
