package com.aurionpro.test;

public class commandline {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0;i<args.length;i++) {
			System.out.println(args[i]);
			sum+=Integer.parseInt(args[i]);
		}
	System.out.println("the sum is"+sum);
	}
	

}
