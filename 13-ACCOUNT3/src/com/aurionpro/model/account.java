package com.aurionpro.model;

public class account {
	private int id;
	private String name;
	private double balance;
	private static  int count = 0;
	
	public static int  getCount() {
		return count;
	}
	
	public account(int id, String name, double balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		count++;
	}
public account(int id) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		count++;
}
public account() {
	count++;
}
	
	
	
	
}
