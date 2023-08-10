package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientbalanceException;
import com.aurionpro.model.InvalidDepositAmmountException;

public class Accounttest {
    public static void main(String[] args) {
        try {
            Account acc = new Account("yash", 1, 900);
            acc.deposit(100);
            System.out.println("account deposited successfully balance: " + acc);
            acc.withdraw(500);
            System.out.println("balance: " + acc.getBalance());
            System.out.println(acc);
        } catch (InsufficientbalanceException e) {
            System.out.println(e.getMessage());
            
        } catch (InvalidDepositAmmountException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Accounttest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
}
