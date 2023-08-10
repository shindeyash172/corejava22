package com.aurionpro.model;

import java.time.LocalDate;

public class Student extends Person {
	private String branch;
	
	
	public Student(int id, String address, LocalDate dateOfBirth) {
		super(id, address, dateOfBirth);
		this.branch = branch;
	}

	

	@Override
	public String toString() {
		return "Student [branch=" + branch + "]";
	}



	public String getBranch() {
		return branch;
	}


	}
