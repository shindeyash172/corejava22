package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
class Product {
	int id;
	String name;
	double price;

public Product(int id,String name,
double price) {
	this.id = id;
	this.name = name;
	this.price = price;
}
}
public class filterdemo {
public static void main(String[] args) {
	List <Product> productsList = new ArrayList<Product>();

	productsList.add(new Product(1,"Laptop",25000));
	
	productsList.add(new Product(2,"hp",34000));
	productsList.add(new Product(2,"acer",70000));
	productsList.add(new Product(2,"apple",90000));
	productsList.add(new Product(2,"lenovo",31000));
//	List<Double> price = new ArrayList<Double>();
	
productsList.stream()
.filter(p->p.price>50000).forEach(pr->System.out.println(pr.price));


}


}
