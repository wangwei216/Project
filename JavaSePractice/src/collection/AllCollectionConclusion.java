package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.*;
import java.util.Iterator;

/**
 * 一、对ArrayList的三种遍历方式总结(list集合是有序可重复。尖括号里面放的是你存放数据的类型，也就是泛型)
 * 	1. for循环遍历
 * 	2. foreach的遍历
 * 		1).先用你放的数据类型进行初始化，后面跟的是冒号，然后是你的集合名字
 * 		2).输出
 * 	3. 使用迭代器的遍历
 *		1).先创建一个迭代器,也就是把数组对象转化为迭代器对象的过程
 *		2).然后判断判断迭代器有没有下一个元素
 *		3).然后把下一个元素强制转为你自己定义的数组类型,输出
 *
 *二、对HashSet的遍历方式总结（set集合是无序不可重复，如果重复会覆盖后面的数据）
 *
 *		(基本原理同上)
 *
 *三、对HashMap的遍历方式总结（map是一种键值对的形式存在的，一个是key对应一个value）
 *
 *		(基本原理同上)
 *		不同的是：map是用put（）方法往集合里面进行丢数据进去
 *		而且map的key 和value 的类型都是多种多样的也可以是数组
 *扩展知识（对于迭代器的源码分析，大概思路就是利用游标的移动和游标是否跟数组的size进行比较）
 *		1.  boolean hasNext(); 		这个就是判断是否有元素没有被遍历
 *		2.  object next();			返回游标的当前位置的元素，并且将游标移动到下一个位置
 *		3.  remove()				删除游标左边的元素，再执行next之后这个操作只能执行一次
 *		
 */
public class AllCollectionConclusion {

	
	public  static void main(String[] args){
		//list集合是有序可重复
		List<String> list = new ArrayList<String>();
		//set集合是无序不可重复，如果重复会覆盖后面的数据
		Set<String> list2 = new HashSet<String>();
		//map是一种键值对的形式存在的，一个是key对应一个value
		Map<String, String[]> list3 = new HashMap<String,String[]>();
		list.add("我是王伟");
		list.add("我是葛豪");
		list.add("我是万奇");
		
		//第一种遍历方式
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		System.out.println("=======");
		
		//第二种遍历方式
		for(String s: list){
			System.out.println(s);
		}
		System.out.println("=======");
		
		//第三种遍历方式,把数组对象转换成迭代器对象
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			 String str =(String) iterator.next();
			 System.out.println(str);
		}
		
		
	}
}
