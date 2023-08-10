package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class Accounttest {
	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(1,"Nitesh",50000);
		CurrentAccount current = new CurrentAccount(1,"Nitesh",10000);
		System.out.println(saving);
		saving.deposit(10000);
		System.out.println(saving);
		saving.withdraw(1000000);
		System.out.println(saving);
		current.withdraw(10000);
		System.out.println(current);
		
	}
}
