package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;
import com.aurionpro.model.genderType;
import com.aurionpro.model.AccountType;

public class accountTest {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1,"Yash",genderType.MALE,10000,AccountType.CURRENT),
        accounts.add(new Account(1,"Yash",genderType.FEMALE,10000,AccountType.SAVINGS),
        accounts.add(new Account(1,"Yash",genderType.MALE,10000,AccountType.SAVINGS),
        accounts.add(new Account(1,"Yash",genderType.FEMALE,10000,AccountType.CURRENT),
        accounts.add(new Account(1,"Yash",genderType.FEMALE,10000,AccountType.CURRENT),
        accounts.add(new Account(1,"Yash",genderType.MALE,10000,AccountType.CURRENT));
        List<Account> maleaccounts = accounts.stream()
                .filter(account -> account.getGender().equals(Typegender.MALE))
                .collect(Collectors.toList());

        maleaccounts.forEach(System.out::println);

        List<Double> balanceList = accounts.stream()
                .map(account -> account.getBalance())
                .collect(Collectors.toList());
        
        
    
    }
}
