package com.aurionpro.model;

import java.io.Serializable;
import java.time.LocalDate;

public  class Person {
	private int id;
	private String address;
	private LocalDate DateOfBirth;
	
	
	public Person(int id, String address, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.address = address;
		DateOfBirth = dateOfBirth;
	}
	
	
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", DateOfBirth=" + DateOfBirth + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
	
}
