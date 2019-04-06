package com.collection;
import java.util.HashSet;
import java.util.Set;

/** 
 * 学生类
 * @author 25528
 *
 */
public class Student {
	public String id;
	
	public String name;
	
	public Set<Course> courses;//存放在set类型的属性当中
	
	public Student(String id,String name){    //添加一个含参构造器
		this.id=id;
		this.name=name;  //新对象的name等于传递进去的name值
		this.courses=new HashSet<Course>();
	}

}
