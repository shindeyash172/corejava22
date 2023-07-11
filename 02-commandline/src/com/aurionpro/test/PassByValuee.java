package com.aurionpro.test;

public class PassByValuee {
	public static void main(String[] args) {
	int number = 10;
	System.out.println("Befor calling incremet methd."+number);
	number = incrementNumberByOne(number);;
	System.out.println("After calling increment methd."+number);
	
}
	private static int incrementNumberByOne(int number) {
		return ++number;
	}
}
		
