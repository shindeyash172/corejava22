package com.aurionpro.model;

public class lamdaTest {
public static void main(String[] args) {
	IGreetable obj = new WelcomeGreeting();
	obj.printGreetings();
	
	IGreetable obj2 = new IGreetable() {
		
		@Override
		public void printGreetings() {
System.out.println("GOOD BYE");			
		
		}
		
	};
	
	
	IGreetable goodDayObj = ()-> System.out.println("good day");
	
	goodDayObj.printGreetings();
}
}
