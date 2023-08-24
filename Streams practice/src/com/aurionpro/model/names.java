package com.aurionpro.model;

import java.util.Arrays;
import java.util.Comparator;

public class names {
public static void main(String[] args) {
	String[] names = {"yash","aniket","akash","bhavesh"};
	
	Arrays.stream(names)
	.sorted()
	.limit(3)
	.forEach(System.out::println);
	
	Arrays.stream(names)
	.filter(name ->name.contains("a"))
	.sorted()
	.limit(3)
	.forEach(System.out::println);
System.out.println("------------");
	Arrays.stream(names)
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);

System.out.println("------------");
	
	Arrays.stream(names)
    .map(name -> name.substring(0, Math.min(3, name.length())))
    .forEach(System.out::println);

	System.out.println("-------");
	Arrays.stream(names)
	.filter(name -> name.length() <=4)
	.forEach(System.out::println);
}
}

