package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements Imovable{

	public Bike(String brand, LocalDate dom) {
		super(brand, dom);
	}

	@Override
	public void move() {
		System.out.println("Bike is moving");		
	}

	@Override
	public void showTopSpeed() {
		System.out.println("bike Top Speed is 80Kmph ");
	}

}
