package com.aurionpro.model;

public class CurrentAccount extends Account {
	private static final double OVERDRAFT_LIMIT = 25000;

    public CurrentAccount(int id, String name, double balance) {
        super(id, name, balance);
      
    }
    @Override
    public boolean withdraw(double amount) {
     if (super.getBalance() - amount > -OVERDRAFT_LIMIT) {
      super.setBalance(super.getBalance() - amount);
      return true;
     }
     return false;
    }
}
    
