package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private static double balance;

	public Account(String name, int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public static double getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

	public void deposit(double amount) throws InvalidDepositAmmountException {
		if (amount <= 0) {
			throw new InvalidDepositAmmountException("Invalid deposit amount");
		} else {
			balance += amount;
		}

	}

	public void withdraw(double amount) throws InsufficientbalanceException {
		if (balance <= 1000) {
			throw new InsufficientbalanceException("Insufficient Fund");

		} else {
			balance -= amount;
		}

	}

}
