package com.collection;
import java.util.HashSet;
import java.util.Set;

/** 
 * ѧ����
 * @author 25528
 *
 */
public class Student {
	public String id;
	
	public String name;
	
	public Set<Course> courses;//�����set���͵����Ե���
	
	public Student(String id,String name){    //���һ�����ι�����
		this.id=id;
		this.name=name;  //�¶����name���ڴ��ݽ�ȥ��nameֵ
		this.courses=new HashSet<Course>();
	}

}
