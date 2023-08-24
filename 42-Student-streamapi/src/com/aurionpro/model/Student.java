package com.aurionpro.model;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private double percentage;
	private List<String> hobbies;
	
	public Student(int id, String name, double percentage, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.hobbies = hobbies;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPercentage() {
		return percentage;
	}
	public List<String> getHobbies() {
		return hobbies;
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
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
}