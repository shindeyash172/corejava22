package com.aurionpro.test;

import com.aurionpro.model.printNumber;

public class threadTest {
	public static void main(String[] args) {
	
//		System.out.println("Inside Main ");
//		for (int i = 31; i < 40; i++) {
//			System.out.println(i);
//		}
//		
		
		printNumber t1 = new printNumber();
		t1.setPriority(2);
		System.out.println(t1.getPriority());
		t1.start();

	printNumber t2 = new printNumber();
	System.out.println("printer 2");
	t2.start();

System.out.println(Thread.MAX_PRIORITY);
System.out.println(Thread.currentThread().getPriority());

	}
}
