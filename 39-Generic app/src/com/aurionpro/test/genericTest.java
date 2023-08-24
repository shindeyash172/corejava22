package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.aurionpro.model.Printvalue;
import com.aurionpro.model.Rectangle;

public class genericTest {
public static void main(String[] args) {
	Printvalue<Integer> obj1 = new Printvalue<Integer>(10);
	System.out.println(obj1);
	
	Printvalue<Double> obj2 = new Printvalue(10.5);
	System.out.println(obj2);
	
	Printvalue<String> obj3 = new Printvalue("yash");
	System.out.println(obj3);
//	
//	Printvalue<Rectangle> obj4 = new Printvalue<Rectangle>(10,20);
//	System.out.println(obj4);
//	
printdetails("yash","yash");
printdetails(1,"yash");


Consumer<String> consumer =(name)->{// consumer
	System.out.println(name);
};
consumer.accept("yash shinde");

Consumer<Integer> int1 = (num)->{ // consumer
System.out.println(num*num);};
int1.accept(2);

Function<String,Integer> func = (name)->{// function
	return name.length();
};
System.out.println(func.apply("Yash"));

Predicate<String> predicateObject = (name)->{// Predicate
	return name.length() >=6;
};

System.out.println(predicateObject.test("Yash"));
System.out.println(predicateObject.test("Yash Shinde "));

BiFunction<Integer, Integer, Integer> add =(num1,num2)->{ // bi function
	return num1+num2;
};
System.out.println(add.apply(10, 90));

BiConsumer<String, Integer> biconsumer = (name,id)->{  // bi consumer
	System.out.println(name);
	System.out.println(id);
};

biconsumer.accept("yash", 1);


BiPredicate<String, String> bipredicate = (name1,name2)->{
	return name1.equals(name2);
};

System.out.println(bipredicate.test("Yash", "Akash"));




List<Integer> intList = Arrays.asList(10,20,30);
printList(intList);
List<Double> doubleList = Arrays.asList(10.4,20.5,30.6);
printList(doubleList);
}
private static <T> void printList(List<T> list) {
	for(T x : list) {
		System.out.println(x);
	}
}




private static <T,S>void printdetails(T i, S string) {
	System.out.println("value1 :"+ i);
	System.out.println("value2 :"+ string);
}


}






