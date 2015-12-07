package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Student> students;
	
	/*
	 * �ڹ������г�ʼ��students����
	 */
	public MapTest(){
		this.students=new HashMap<String, Student>();
	}
	/*
	 * ��ӣ�����ѧ��ID���ж��Ƿ�ռ�ã�
	 * ��δ��ռ�ã�������ѧ��������������ѧ������
	 * ������ӵ�students��
	 */
	public void testPut(){
		//����scanner���󣬻�ȡ������ַ�
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("������ѧ��ID:");
			String stuID=console.next();
			Student st=students.get(stuID);
			if(st==null){
				System.out.println("������ѧ��������");
				String name=console.next();
				Student newStudent=new Student(stuID, name);
				students.put(stuID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(stuID).name);
				i++;
			}else{
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}

	}
	
	/*
	 * ʹ��keySet()������������������ѧ������Ϣ
	 */
	public void testKeySet(){
		Set<String> keySet=students.keySet();
		//���keySet��������С
		System.out.println("�ܹ���"+students.size()+"��ѧ����");
		for(String stuID:keySet){
			Student st=students.get(stuID);
			if(st!=null)
				System.out.println("ѧ����"+st.name);
		}
	}
	
	/*
	 * ɾ��ѧ�����е���Ϣ
	 */
	public void testRemove(){
		//����scanner����
		Scanner console=new Scanner(System.in);
		while(true){
			System.out.println("������Ҫɾ����ѧ��ID:");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null){
				System.out.println("��ѧ��ID�����ڣ�");
				continue;
			}else{
				students.remove(ID);
				break;
			}
		}
	}
	
	/*
	 * ʹ��entrySet()��������
	 */
	public void testEntrySet(){
		Set<Entry<String, Student>> entrySet=students.entrySet();
		for(Entry<String, Student> entry:entrySet){
			String ID=entry.getKey();
			System.out.println("ѧ��ID:"+ID);
			String name=entry.getValue().name;
			System.out.println("ѧ��������"+name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapTest mt=new MapTest();
		mt.testPut();
//		mt.testKeySet();
		mt.testRemove();
		mt.testEntrySet();
	}

}
