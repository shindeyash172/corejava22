package com.aurionpro.test;

public class commandline {

	public static void main(String[] args) {
		
		  int[] numbers = new int[args.length];
		for (int i = 0;i<args.length;i++) {
			numbers[i] = Integer.parseInt(args[i]);
			
		}
	System.out.println("the sum is"+sum);
	}
	

}
