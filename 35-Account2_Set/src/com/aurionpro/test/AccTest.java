package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccTest {

    public static void main(String[] args) {
        Set<Account> accountSet = new HashSet<Account>();
        
        accountSet.add(new Account(1, "Yash", 1000.0 ));
        accountSet.add(new Account(2, "Raj", 2000.0));
        accountSet.add(new Account(2, "Raj", 2000.0));
        accountSet.add(new Account(1, "Yash", 1000.0 ));
        
        for (Account account : accountSet) {
           System.out.println(account);
        }
    }
}
