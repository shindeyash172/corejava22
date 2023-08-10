package com.aurionpro.test;

import com.aurionpro.model.Child;

public class Inhertience {
	public static void main(String[] args) {
		Child obj = new Child(90);
		System.out.println("obj:"+obj);
		Child.printSuperValue();
}
}