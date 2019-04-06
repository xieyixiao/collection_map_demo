package com.collection;
/*
 * 课程类
 */

public class Course {
	
	public  String id;
	/*
	 * 实际开发中，所有属性私有化,用getter和setter访问属性
	 * private String id;
	 * public String getId(){
	 * return id;
	 * }
	 * public void setId(String id){
	 * this.id=id;
	 * }
	 */
	
	public String name;
	
	public Course(String id,String name){  //添加一个含参构造器
		this.id=id;     //传递两个值
		
		this.name=name;
	}
	public Course(){
		
	}

}
