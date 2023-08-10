package com.aurionpro.model;

public class Customer {
private static  String id;
private static  String name;
private static int count = 1001;
@Override
public String toString() {
	return "Customer []";
}


public Customer(String name) {
	this.id = autoGenerateId();
	this.name = name;
	
}
public String getId() {
	return id;
}
public void setId(String id) {
	Customer.id = id;
}
public String getName() {
	return name;
}
public  void setName(String name) {
	Customer.name = name;
}

private static String autoGenerateId() {
  
 return "C" +(count++);
}

}
