package com.aurionpro.test;

import com.aurionpr.model.Account;
import com.aurionpr.model.TypeAccount;

public class AccountTest {
	public static void main(String[] args) {
		
		
		Account account1 = new Account(1,"Rohan",1000, TypeAccount.SAVINGS);
		Account account2 = new Account(1,"Yash",1000, TypeAccount.SAVINGS);
						
				printDepositMessage(account,account.deposit(1010));
				printDepositMessage(account,account.deposit(3010));
				printWithdrawMessage(account,account.withdraw(31000));
			}

			private static void printWithdrawMessage(Account account, boolean withdraw) {
				if(withdraw) {
					System.out.println("Withdrawal successful...\n"+ account);
				}
				else {
					System.out.println("Could not withdraw..transaction failed!!");
				}
			}

			private static void printDepositMessage(Account account, boolean deposit) {
				if(deposit) {
					System.out.println("Deposited successfully...\n"+ account);
				}
				else {
					System.out.println("Could not deposit..transaction failed!!");
				}
			}
		}

	}
}
