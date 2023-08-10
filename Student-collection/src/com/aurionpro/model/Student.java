package com.aurionpro.model;

public class Student {
	private String name ;
	private double percentage ;
	private int id;
	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", percentage=" + percentage + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
}

