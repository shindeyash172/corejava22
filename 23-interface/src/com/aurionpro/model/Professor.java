package com.aurionpro.model;

import java.time.LocalDate;

public class Professor extends Person implements SalariedEmployee {
	private double salary;

	public Professor(int id, String address, LocalDate dateOfBirth) {
		super(id, address, dateOfBirth);
		this.salary=salary;
	}
@Override
	public double CalculateSalary() {
		return salary;
	}

	@Override	
	public String toString() {
		return "Professor [salary=" + salary + ", CalculateSalary()=" + CalculateSalary() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + "]";
	}

}
