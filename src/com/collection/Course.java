package com.collection;
/*
 * �γ���
 */

public class Course {
	
	public  String id;
	/*
	 * ʵ�ʿ����У���������˽�л�,��getter��setter��������
	 * private String id;
	 * public String getId(){
	 * return id;
	 * }
	 * public void setId(String id){
	 * this.id=id;
	 * }
	 */
	
	public String name;
	
	public Course(String id,String name){  //���һ�����ι�����
		this.id=id;     //��������ֵ
		
		this.name=name;
	}
	public Course(){
		
	}

}
