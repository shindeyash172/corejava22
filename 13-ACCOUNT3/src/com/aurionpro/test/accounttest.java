package com.aurionpro.test;

import com.aurionpro.model.account;

public class accounttest {
	public static void main(String[] args) {
		
	        account account1 = new account(123);
	        account account2 = new account(455, "John Doe", 1000.0);
	        account account3 = new account(125,"Yash",2000.0);
	        account account4 = new account(128,"akash",2000.0);
	        account account5 = new account();
	        account account6 = new account(131415, "Alice Johnson", 3000.0);
	     
	        System.out.println("Number of objects created: " + account.getCount());

	        System.out.println("Number of objects created: " + account4.getCount());
	}

	
}
