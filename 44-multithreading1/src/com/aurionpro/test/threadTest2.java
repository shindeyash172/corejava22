package com.aurionpro.test;

import com.aurionpro.model.printCharacter;

public class threadTest2 {
public static void main(String[] args) {
	printCharacter printchar = new printCharacter();
	Thread t1 = new Thread(printchar);
	t1.start();
	Thread t2 = new Thread(printchar);
	t2.start();
}
}
