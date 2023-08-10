package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.aurionpro.model.Student;

public class studentTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(); 
        students.add(new Student(1, "yash", 25.25)); 
        students.add(new Student(2, "Akash", 96)); 
        students.add(new Student(3, "Umaid", 50)); 
        students.add(new Student(4, "Nitesh", 22)); 

//        Student 
//        
//        for(Student x: students) {
//        	if(x.getPercentage()>maxStudent.getpercentage()) {
//        		maxStudents=x;
//        	}
//        	System.out.println(x);
//        }
        Student highestPercentageStudent = Collections.max(students, Comparator.comparingDouble(Student::getPercentage));
        Student lowestPercentageStudent = Collections.min(students, Comparator.comparingDouble(Student::getPercentage));
        Collections.sort(students, Comparator.comparing(Student::getName));
        
        System.out.println("Student with highest percentage:");
        System.out.println("ID: " + highestPercentageStudent.getId() + ", Name: " + highestPercentageStudent.getName() + ", Percentage: " + highestPercentageStudent.getPercentage());

        System.out.println("Student with lowest percentage:");
        System.out.println("ID: " + lowestPercentageStudent.getId() + ", Name: " + lowestPercentageStudent.getName() + ", Percentage: " + lowestPercentageStudent.getPercentage());
        System.out.println("Sorted List of students by name:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Percentage: " + student.getPercentage());
        }
    
    }
}