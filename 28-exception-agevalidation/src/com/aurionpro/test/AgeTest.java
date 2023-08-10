package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.InvalidAgeException;
import com.aurionpro.util.AgeUtil;

public class AgeTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		
		try {
			String validateAgeMessage = AgeUtil.validateAge(age);
			System.out.println(validateAgeMessage);
			
		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---end---");
	}
}
