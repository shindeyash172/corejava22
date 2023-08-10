package com.aurionpro.test;

import com.aurionpro.model.Customer;

public class Customertest {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Yash");
		System.out.println("ID: " + customer1.getId());	

		Customer customer2 = new Customer("Akash");
		System.out.println("ID: " + customer2.getId()); 	
		
	}
}
