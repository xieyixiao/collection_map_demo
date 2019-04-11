package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	  /**
     * ���з��͡���Course,��List��������
     * @param args
     */
	public List<Course> courses;
	
	public TestGeneric(){        //��д������
		this.courses=new ArrayList<Course>();
	}
	
	/**
	 * �������
	 * @param args
	 */
	public void testAdd(){
		Course cr1=new Course("1","��ѧ����");
		courses.add(cr1);
		//���ͼ����У�������ӷ��͹涨�����ͼ�������������Ķ�����󣬷��򱨴�
		//courses.add("�ܷ����һЩ��ֵĶ����أ�");
		Course cr2=new Course("2","Java����");
		courses.add(cr2);
	}
	/**
	 * ����ѭ������
	 * @param args
	 */
	public void testForEach(){
		for(Course cr:courses){
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/**
	 * ���ͽ�Ͽ�����ӷ��͵������ʵ������
	 * @param args
	 */
	public void testChild(){
		ChildCourse ccr=new ChildCourse();
		ccr.id="3";
		ccr.name=("���������͵Ŀγ̶���ʵ��");
		courses.add(ccr);
	}
	
	/**
	 * ���Ͳ���ʹ�û�������
	 * @param args
	 */
	public void testBasicType(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		System.out.println("�������͵İ�װ����Ϊ���ͣ�"+list.get(0));
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();

	}

}
