package com.aurionpro.model;

import java.time.LocalDate;

public abstract class Vehicle {
	private String brand;
	private LocalDate dom;
	public String getBrand() {
		return brand;
	}

	public LocalDate getDom() {
		return dom;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setDom(LocalDate dom) {
		this.dom = dom;
	}

	
	
	public Vehicle(String brand, LocalDate dom) {
		super();
		this.brand = brand;
		this.dom = dom;
	}
	public abstract void showTopSpeed();

}




