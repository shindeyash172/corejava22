package com.aurionpro.test;

public class unchecked {
	public static void main(String[] args) {
		System.out.println("Main Start");
		function1();
		System.out.println("main end");
	}
	private static void function1() {
	System.out.println("function1 Start");
	function2();
	
	
	System.out.println("function1 end");
	}
	private static void function2() {
	System.out.println("function2 Start");
	function3();
	System.out.println("function2 end");
	}
	private static void function3 () {
	System.out.println("function3 Start");
	try {
		function4();
	} catch (Exception e) {
System.out.println("handled ");
	}
	System.out.println("function3 end");
	}
	private static void function4 () {
	throw new RuntimeException("Some message");

}
}