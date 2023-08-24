package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class emp {
int empid ;
static String name;
double Salary;

public emp(int empid ,
String name,
double Salary) {
	this.empid = empid;
	this.name = name;
	this.Salary = Salary;
}

public int getEmpid() {
	return empid;
}

public static String getName() {
	return name;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public void setName(String name) {
	this.name = name;
}
}


public class Employee{
	public static void main(String[] args) {
		
	
	List<emp> employeelist = Arrays.asList(
			new emp(1,"yash",40000),
			new emp(2,"raj",10000),
			new emp(3,"akash",50000),
			new emp(4,"nitesh",34000)
			);
	List<Double> employeesalList = employeelist.stream()
	.filter(e->e.Salary > 20000)
	.map(e->e.Salary)
	.collect(Collectors.toList());
	
	System.out.println(employeesalList);
	
	
	}

	
}


