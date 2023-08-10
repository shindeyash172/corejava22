package com.aurionpro.test;

import java.io.Serializable;

public class Student implements Serializable {
private String name ;
public Student(String name, int rollno) {
	super();
	this.setName(name);
	this.setRollno(rollno);
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private int rollno;

}
