package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements Imovable {

	public Car(String brand, LocalDate dom) {
		super(brand, dom);
	}

	@Override
	public void move() {
		System.out.println("car is moving");		
	}

	@Override
	public void showTopSpeed() {
		System.out.println("car Top Speed is 80Kmph");		
	}
	


}
 