package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Student> students;
	
	/*
	 * 在构造器中初始化students属性
	 */
	public MapTest(){
		this.students=new HashMap<String, Student>();
	}
	/*
	 * 添加：输入学生ID，判断是否被占用，
	 * 若未被占用，则输入学生姓名，创建新学生对象，
	 * 并且添加到students中
	 */
	public void testPut(){
		//创建scanner对象，获取输入的字符
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生ID:");
			String stuID=console.next();
			Student st=students.get(stuID);
			if(st==null){
				System.out.println("请输入学生姓名：");
				String name=console.next();
				Student newStudent=new Student(stuID, name);
				students.put(stuID, newStudent);
				System.out.println("成功添加学生："+students.get(stuID).name);
				i++;
			}else{
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}

	}
	
	/*
	 * 使用keySet()方法遍历，并输出添加学生的信息
	 */
	public void testKeySet(){
		Set<String> keySet=students.keySet();
		//输出keySet的容量大小
		System.out.println("总共有"+students.size()+"个学生！");
		for(String stuID:keySet){
			Student st=students.get(stuID);
			if(st!=null)
				System.out.println("学生："+st.name);
		}
	}
	
	/*
	 * 删除学生表中的信息
	 */
	public void testRemove(){
		//创建scanner对象
		Scanner console=new Scanner(System.in);
		while(true){
			System.out.println("请输入要删除的学生ID:");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null){
				System.out.println("该学生ID不存在！");
				continue;
			}else{
				students.remove(ID);
				break;
			}
		}
	}
	
	/*
	 * 使用entrySet()方法遍历
	 */
	public void testEntrySet(){
		Set<Entry<String, Student>> entrySet=students.entrySet();
		for(Entry<String, Student> entry:entrySet){
			String ID=entry.getKey();
			System.out.println("学生ID:"+ID);
			String name=entry.getValue().name;
			System.out.println("学生姓名："+name);
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
