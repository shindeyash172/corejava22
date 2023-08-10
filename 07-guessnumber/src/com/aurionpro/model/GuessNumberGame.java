package com.aurionpro.model;
import java.util.Scanner;
public class GuessNumberGame {
private int chance = 6;

private boolean check(int num) {
	if(num>1&&num<100) {
		return true;
	}else{
		return false;
		}
}
private int generaterandomnumber() {
	return (int)(Math.random()*(99)+1);
}
public void playgame() {
	int random = generaterandomnumber();
	Scanner sc = new Scanner(System.in);
	int chance = 6;
	System.out.println("enter a number");
	
	while(chance>1) {
		int number = sc.nextInt();
		if(!check(number)) {
			System.out.println("Enter a number between 1 to 100");
			}
		else if(check(number)&&number == random) {
			System.out.println("You won");
			break;
		}
		else
		{
			System.out.println("wrong number enter again");
		}
	
	}
}
}


