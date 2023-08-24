package com.aurionpro.model;

import java.util.List;

public class employee {

	private int id;
	private String name;
	private String department;
	private double salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public employee(int id, String name, String department,double salary){
//		super();
		this.id = id;
		this.name = name;
		this.department= department;
		this.salary = salary;
	}
	
	
}