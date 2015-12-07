package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class testCollectionSort {

	/**
	 * 1��������List<String>֮�����������ʮ������ַ���
	 * 2��ÿ���ַ����ĳ���Ϊ10���ڵ��������
	 * 3��ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ����ַ������ظ�
	 * 4��ÿ������ַ��������ظ�
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
		System.out.println("------����ǰ----------");
		for (String string : stringList) {
			System.out.println("�ɹ���ӵ��ַ���Ϊ��"+string);
		}
		Collections.sort(stringList);
		System.out.println("-----�����-------");
		for (String string : stringList) {
			System.out.println("�ɹ���ӵ��ַ���Ϊ��"+string);
		}
	}	
	/**
	 * ��������ַ���
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
	 * ����ʮ��List<Integer>�������
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
		System.out.println("-------����ǰ----------");
		for (Integer integer : integerList) {
			System.out.println("�ɹ���ӵ��ַ���Ϊ��"+integer);
		}
		Collections.sort(integerList);
		System.out.println("-----�����--------");
		for (Integer integer : integerList) {
			System.out.println("�ɹ���ӵ��ַ���Ϊ��"+integer);
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
