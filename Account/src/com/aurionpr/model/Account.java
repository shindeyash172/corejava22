package com.aurionpr.model;

public class Account {
	private long accountNumber;

	private String Name;
	private double balance;
	private TypeAccount account;
	
	public Account(long accountNumber, String name, double balance, TypeAccount account) {
		
		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
		this.account = account;
	}
	
	
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public TypeAccount getAccount() {
		return account;
	}
	public void setAccount(TypeAccount account) {
		this.account = account;
	}
	private boolean validate(double amount) {
		 
		 return amount>0.0;
		}
	public  void  deposit( double amount)
		 {
		  
		   if(validate(amount)) {
		    this.balance+=amount;
		    
		   }
		  
		 }

	public  void withdraw(double amount) {
		  
		   if(this.account.equals(TypeAccount.CURRENT )&& validate(amount)) {
		   this.balance+=25000;
		   this.balance-=amount;
		    
		  
		 }
		   else {
		    this.balance-=amount;
		   }
		 }


}
