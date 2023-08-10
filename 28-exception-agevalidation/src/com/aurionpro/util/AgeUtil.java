package com.aurionpro.util;

import com.aurionpro.exception.InvalidAgeException;

public class AgeUtil {
	
	
	public static String validateAge(int age)throws InvalidAgeException {
		if(age>=18) {
			return "Eligble for voting";
		}
		else {
			throw new InvalidAgeException("Invalid age");
		}
	}
}
