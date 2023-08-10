package com.aurionpro.mode;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private AccountType accountType;
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", accountType="
				+ accountType + "]";
	}
	
	
	
	public Account(long accountNumber, String name, double balance, AccountType accountType) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public boolean withdraw(double amount) {
		if(accountType.equals(AccountType.SAVING)) {
			if(balance-amount>=1000) {
				balance-=amount;
				return true;
			}
			return false;
		}
			
			else if(accountType.equals(AccountType.CURRENT)) {
			if(balance-amount >= -25000){
				balance-=amount;
				return true;
				}
			return false;
		}
		return false;
		
		
		
		
	}
	public boolean deposit (double amount) {
		if(amount > 0) {
			balance+=amount;
			return true;
			}
		else {
		return false;
		}
	}
	
}
