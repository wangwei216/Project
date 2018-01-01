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
 * һ����ArrayList�����ֱ�����ʽ�ܽ�(list������������ظ�������������ŵ����������ݵ����ͣ�Ҳ���Ƿ���)
 * 	1. forѭ������
 * 	2. foreach�ı���
 * 		1).������ŵ��������ͽ��г�ʼ�������������ð�ţ�Ȼ������ļ�������
 * 		2).���
 * 	3. ʹ�õ������ı���
 *		1).�ȴ���һ��������,Ҳ���ǰ��������ת��Ϊ����������Ĺ���
 *		2).Ȼ���ж��жϵ�������û����һ��Ԫ��
 *		3).Ȼ�����һ��Ԫ��ǿ��תΪ���Լ��������������,���
 *
 *������HashSet�ı�����ʽ�ܽᣨset���������򲻿��ظ�������ظ��Ḳ�Ǻ�������ݣ�
 *
 *		(����ԭ��ͬ��)
 *
 *������HashMap�ı�����ʽ�ܽᣨmap��һ�ּ�ֵ�Ե���ʽ���ڵģ�һ����key��Ӧһ��value��
 *
 *		(����ԭ��ͬ��)
 *		��ͬ���ǣ�map����put��������������������ж����ݽ�ȥ
 *		����map��key ��value �����Ͷ��Ƕ��ֶ�����Ҳ����������
 *��չ֪ʶ�����ڵ�������Դ����������˼·���������α���ƶ����α��Ƿ�������size���бȽϣ�
 *		1.  boolean hasNext(); 		��������ж��Ƿ���Ԫ��û�б�����
 *		2.  object next();			�����α�ĵ�ǰλ�õ�Ԫ�أ����ҽ��α��ƶ�����һ��λ��
 *		3.  remove()				ɾ���α���ߵ�Ԫ�أ���ִ��next֮���������ֻ��ִ��һ��
 *		
 */
public class AllCollectionConclusion {

	
	public  static void main(String[] args){
		//list������������ظ�
		List<String> list = new ArrayList<String>();
		//set���������򲻿��ظ�������ظ��Ḳ�Ǻ��������
		Set<String> list2 = new HashSet<String>();
		//map��һ�ּ�ֵ�Ե���ʽ���ڵģ�һ����key��Ӧһ��value
		Map<String, String[]> list3 = new HashMap<String,String[]>();
		list.add("������ΰ");
		list.add("���Ǹ��");
		list.add("��������");
		
		//��һ�ֱ�����ʽ
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		System.out.println("=======");
		
		//�ڶ��ֱ�����ʽ
		for(String s: list){
			System.out.println(s);
		}
		System.out.println("=======");
		
		//�����ֱ�����ʽ,���������ת���ɵ���������
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			 String str =(String) iterator.next();
			 System.out.println(str);
		}
		
		
	}
}
