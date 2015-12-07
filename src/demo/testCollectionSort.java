package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class testCollectionSort {

	/**
	 * 1、创建完List<String>之后，往其中添加十条随机字符串
	 * 2、每条字符串的长度为10以内的随机整数
	 * 3、每条字符串的每个字符都为随机生成的字符，字符可以重复
	 * 4、每条随机字符串不可重复
	 */
	public void testSort(){
		List<String> stringList=new ArrayList<String>();
		Random random=new Random();
		String str;
		for(int i=0;i<10;i++){
			int stringLength=random.nextInt(10);
			do{
				str=randomString(stringLength);
			}while(stringList.contains(str));
			stringList.add(str);
		}
		System.out.println("------排序前----------");
		for (String string : stringList) {
			System.out.println("成功添加的字符串为："+string);
		}
		Collections.sort(stringList);
		System.out.println("-----排序后-------");
		for (String string : stringList) {
			System.out.println("成功添加的字符串为："+string);
		}
	}	
	/**
	 * 产生随机字符串
	 */
	public String randomString(int length){
		String base="abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb=new StringBuffer();
		Random random =new Random();
		for(int i=0;i<=length;i++){
			int index=random.nextInt(base.length());
			sb.append(base.charAt(index));
		}
		return sb.toString();
	}
	
	/**
	 * 创建十条List<Integer>随机整数
	 */
	public void testSort2(){
		List<Integer> integerList=new ArrayList<>();
		Random random=new Random();
		int k;
		for(int i=0;i<10;i++){
			do{
				k=random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
		}
		System.out.println("-------排序前----------");
		for (Integer integer : integerList) {
			System.out.println("成功添加的字符串为："+integer);
		}
		Collections.sort(integerList);
		System.out.println("-----排序后--------");
		for (Integer integer : integerList) {
			System.out.println("成功添加的字符串为："+integer);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCollectionSort tcs=new testCollectionSort();
		tcs.testSort();
//		tcs.testSort2();
	}

}
