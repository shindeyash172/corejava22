package com.aurionpro.test;

import com.aurionpro.mode.Account;
import com.aurionpro.mode.AccountType;

public class Accounttest {
	public static void main(String[] args) {
		Account acc = new Account (20012 ,"Yash", 1000 , AccountType.CURRENT);
		Account acc1 = new Account(20013,"AKASH",1000,AccountType.SAVING);
		System.out.println("account detalis"+acc);
	
		printdepostmessage(acc1,acc1.deposit(20000));
		printupdateddetails(acc1);
		printWithdrawMessage(acc1,acc1.withdraw(24000));
		printupdateddetails(acc1);
		printdepostmessage(acc,acc.deposit(20000));
		printupdateddetails(acc1);
		printWithdrawMessage(acc,acc.withdraw(25000));
	}	
		
	
	
	private static void printWithdrawMessage(Account account, Boolean withdraw) {
			if(withdraw) {
				System.out.println("withdraw successfull"+account);
			}
			else {
				System.out.println("withdraw unsccessfull,transaction failed");
			}
		}
	private static void printdepostmessage(Account account, Boolean deposit) {
		if(deposit) {
			System.out.println("Transaction successful");
		}
		else {
			System.out.println("Transaction unsuccessful");
		}
		
	}
	private static void printupdateddetails(Account account) {
		System.out.println("print updated details"+account);
	}
		
		
	
	
	
}
