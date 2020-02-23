package com.wangpanlong.service.impl;

import com.wangpanlong.pojo.Student;
import com.wangpanlong.service.StudentService;

public class StudentServiceImpl implements StudentService{

	public Student getById(int id) {
		// TODO Auto-genera"ted method stub
		
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("张三"+id);
		return student;
	}

	public Student addAge(Student stu,int n) {
		// TODO Auto-generated method stub
//		增加年龄
		stu.setAge(stu.getAge()+n);
		return stu;
	}

	public Student minusAge(Student stu, int n) {
		// TODO Auto-generated method stub
		
		stu.setAge(stu.getAge()-n);
		return stu;
	}

	public Student rideAge(Student stu, int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()*n);
		return stu;
	}

	public Student divdeAge(Student stu, int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()/n);
		return stu;
	}

}
