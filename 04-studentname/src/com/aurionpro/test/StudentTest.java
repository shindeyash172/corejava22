package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 10;
		student.name = "yash";
		student.email= "shindeyash172@gmail.com";
		System.out.println("Student id ="+student.id);
		System.out.println("Student name ="+student.name);
		System.out.println("Student email ="+student.email);
	}


}
