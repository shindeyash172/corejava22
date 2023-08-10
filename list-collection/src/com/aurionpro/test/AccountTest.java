package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.aurionpro.model.Account;
import com.aurionpro.model.SortByBalance;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new Account(11, "Jay", 20000));
		accounts.add(new Account(52, "Yash", 150000));
		accounts.add(new Account(23, "Raj", 50000));
		accounts.add(new Account(41, "Avi", 200000));
		accounts.add(new Account(25, "Aju", 10000));
		

		
		Collections.sort(accounts,new SortByBalance());
		Collections.sort(accounts,Comparator.comparingDouble(Account::getBalance).reversed());
		
		System.out.println(accounts);
		
		
		
		

	}

}

































//List<Account> highBalanceAccount=new ArrayList<Account>();
//
//for(Account x:accounts) {
//	if(x.getBalance()>=100000) {
//		highBalanceAccount.add(x);
//	}
//}

//Account test = new Account(4, "Avi", 200000);
//System.out.println(accounts.contains(test));