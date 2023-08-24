package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {
public static void main(String[] args) {
	List<String> cars= Arrays.asList("skoda","bmw","suzuki","tata");
	List<String> carUppercase = new ArrayList<String>();

	carUppercase=cars.stream().
			map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(carUppercase);
			
	
	
}
}
