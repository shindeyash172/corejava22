package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Person;
import com.aurionpro.model.Student;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person(10,"Mumbai",LocalDate.of(2023, 4, 17));
		System.out.println(person);
		
		
	}
}

	