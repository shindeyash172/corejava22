package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
	
	
	map.put("India", 120);
	map.put("China", 180);
	
	
	map.put("China", 200);// to update the value
	
	
	if(map.containsKey("China")) {
		System.out.println(" true");
	}else {
		System.out.println("False");
	}
System.out.println(map.get("China"));
}




}
