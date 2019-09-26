package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	public SetTest(){
		coursesToSelect=new ArrayList<Course>();
	}
	

	/**
	 * ������coursesToSelect����ӱ�ѡ�γ�
	 */
	public void testAdd(){
		/**
		 * ����һ���γ̶��󣬲�ͨ����������add��������ӵ���ѡ�γ�List��
		 */
		Course cr1=new Course("1","���ݽṹ");//����Course�Ĺ�����
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);//������鼯�ϱ�ΪObject���ͣ�ȡ��ʱ��Ҫ����ת��
		//System.out.println("����˿γ̣�"+temp.id+":"+temp.name);
	
		
		 Course cr2=new Course("2","C����");
		 coursesToSelect.add(0,cr2);
		 Course temp2=(Course) coursesToSelect.get(0);
		// System.out.println("����˿γ̣�"+temp2.id+":"+temp2.name);
		 
//		 coursesToSelect.add(cr1);
//		 Course temp0=(Course) coursesToSelect.get(2);//������鼯�ϱ�ΪObject���ͣ�ȡ��ʱ��Ҫ����ת��
//		 System.out.println("����˿γ̣�"+temp0.id+":"+temp0.name);
//		 

		
		 /**
		  * addAll����
		  */
		 Course[] course={new Course("3","��ɢ��ѧ"),new Course("4","�������")};
    		coursesToSelect.addAll(Arrays.asList(course));
			Course temp3=(Course) coursesToSelect.get(2);
			Course temp4=(Course) coursesToSelect.get(3);
			//System.out.println("��������ſγ̣�"+temp3.id+":"+temp3.name+
			//		";"+temp4.id+":"+temp4.name);
//			
			
		Course[] course2={new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2,Arrays.asList(course2));			
		Course temp5=(Course) coursesToSelect.get(2);
		Course temp6=(Course) coursesToSelect.get(3);
		//System.out.println("��������ſγ̣�"+temp5.id+":"+temp5.name+
			//	";"+temp6.id+":"+temp6.name);
	
}
	
	/**
	 * ͨ��for each�������ʼ���Ԫ��
	 */
	public void testForEach(){
		System.out.println("�����¿γ̴�ѡ(ͨ��for each������)��");
		for(Object obj:coursesToSelect){
			Course cr=(Course) obj;
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st=new SetTest();
		st.testAdd();
		st.testForEach();
		//����һ��ѧ������
		Student student=new Student("1","С��");
		System.out.println("��ӭѧ����"+student.name+"ѡ�Σ�");
		//����һ��Scanner�����������ܴӼ�������Ŀγ�ID
		Scanner console=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("������γ�ID��");
			String courseId=console.next();
			for(Course cr:st.coursesToSelect){
				if(cr.id.equals( courseId)){
					student.courses.add(cr);
					/**
					 * Set�У����ĳ������������Ӷ��ٴΣ�
					 * ����ֻ�ᱣ��һ�����󣨵����ã���
					 * ���ң��������ǵ�һ����ӵ���һ��
					 */
					//student.courses.add(null);
					//student.courses.add(cr);
				}
			}
			
		}
		st.testForEachForSet(student);
		

	}
	
	public void testForEachForSet(Student student){
		//��ӡ�����ѧ����ѡ�Ŀγ̣�
		System.out.println("��ѡ���ˣ�"+student.courses.size()+"�ſγ�");
				for (Course cr:student.courses){
					System.out.println("ѡ���˿γ̣�"+
				cr.id+":"+cr.name);
		}
	}

}
