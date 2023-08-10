package com.aurionpro.test;

import com.aurionpro.mode.BMICalculator;

public class personest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculator bmi=new BMICalculator(168,60);
		double value=bmi.calculate();
		bmi.print((int)value);
		
}
}