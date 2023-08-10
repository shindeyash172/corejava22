package com.aurionpro.model;

public class Parent {
    private static int value;

    public Parent(int value) {
        this.value = value;
        System.out.println("Inside Parent");
    }
    public  static int getValue() {
      return value;
  }
   
    }

   

	
	
	
	

