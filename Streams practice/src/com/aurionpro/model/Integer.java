package com.aurionpro.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Integer {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
	
	Integer min = Collection.min(numbers);
	System.out.println("Minimum value:" +min);

	Integer max = Collections.max(numbers);
	System.out.println("maximun value:" +max);

}
}
