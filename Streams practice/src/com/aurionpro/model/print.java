package com.aurionpro.model;

import java.util.Arrays;

public class print {
public static void main(String[] args) {
	String[] names = {"Jayesh", "Nimesh", "Mahesh", "Ramesh"};

	Arrays.stream(names)// names.stream()
	      .forEach(name -> System.out.println(name));
	
	Arrays.asList(names)//Arrays.asList(names) and forEach
	      .forEach(name -> System.out.println(name));
	
	Arrays.asList(names)//Using static reference method:
    .forEach(System.out::println);
}
}
