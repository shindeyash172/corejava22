package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurencetest {
	public static void main(String[] args) {
	
    List<Integer> numbers = Arrays.asList(10,10,20,30,40,50,60);
    
    Map<Integer, Integer> occurrences = new HashMap<>();
    
    for(Integer x :numbers) {
    if(!occurrences.containsKey(x)) {
    	occurrences.put(x,1);
    }
    else {
    	occurrences.put(x,occurrences.get(x)+1);
    }
    }
    occurrences.forEach((key,value)->{
    	System.out.println(key+" "+value);
    });
	}
}
	