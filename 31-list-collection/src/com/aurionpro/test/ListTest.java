package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		System.out.println(list);
//List<Integer> list2 = new ArrayList<>();
//		
//		
//		list2.add(100);
//		list2.add(200);
//		list.addAll(list2);
//		
//		System.out.println(list2);
//		System.out.println(list.containsAll(list2));
//		System.out.println(list);
		
		
		
//		System.out.println(list);
//		
//		list.size();
//		System.out.println("size:"+list.size());
//		
////		
////		list.remove(0);
////		list.remove(new Integer(40));
////		System.out.println(list.size());
////		System.out.println(list);
////		
//		
//		
//		System.out.println(list.contains(30));
//		list.set(0, 60);
//		System.out.println(list);
//		
//		method 1
		for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));	
		}
		System.out.println("-------");
//		method2
		for(Integer x : list) {
			System.out.println(x);
		}
		System.out.println("-------");
		//method 3
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------");
		//method4
		list.forEach((num)->{
			System.out.println(num);
		});
		System.out.println("-------");
		//method5
		list.forEach(System.out::println);
	
	}

}

