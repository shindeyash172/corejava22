package com.aurionpro.model;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Mapdemo2 {
public static void main(String[] args) {
	List<String> cars= Arrays.asList("skoda","bmw","suzuki","tata");
	List<String> lengthcars = new ArrayList<String>();
System.out.println(cars);

 cars.stream().map(carname->carname.length()).forEach(len->System.out.println(len));
	List<Integer> numbers= Arrays.asList(1,3,4,5,6);
	List<Integer> multpliednumbers= new ArrayList<Integer>();
	
	multpliednumbers = numbers.stream().map(num->num*3).collect(Collectors.toList());
	System.out.println(multpliednumbers);
 
}
}
