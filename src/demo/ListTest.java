package demo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public List<Object> courseToSelect;
	
	public ListTest(){
		this.courseToSelect=new ArrayList<Object>();
	}
	public void testAdd(){
		Course cr1=new Course("1", "数据结构");
		courseToSelect.add(cr1);
		Course temp=(Course) courseToSelect.get(0);
		System.out.println(temp.id+":"+temp.name);
	}
	public static void main(String[] args){
		ListTest It=new ListTest();
		It.testAdd();
	}
}
