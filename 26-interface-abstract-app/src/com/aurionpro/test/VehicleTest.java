package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.Imovable;
import com.aurionpro.model.Vehicle;

public class VehicleTest {
	
	 	    	    public static void main(String[] args) {
	    	        Imovable[] movables = {
	    	        new Car("Toyota", LocalDate.of(2022, 8, 1)),
	    	        new Bike("Honda", LocalDate.of(2021, 9, 10)),
	    	        new Bus("Volvo", LocalDate.of(2023, 4, 15)),
	    	        };
	    	        for (int i = 0; i < movables.length; i++) {
	    	            startMoving(movables[i]);
//	    	            printDetails(movables[i]);
	    	        }
	    	    }

	 	    	 
	    	    public static void startMoving(Imovable movable) {
	    	        movable.move();
	    	        printDetails(movable);
	    	        ((Vehicle) movable).showTopSpeed();
	    	    }
	    	    public static void printDetails(Imovable movable) {
	    	        if (movable instanceof Vehicle) {
	    	            Vehicle vehicle = (Vehicle) movable;
	    	            System.out.println("Brand: " + vehicle.getBrand());
	    	            System.out.println("Date of Manufacture: " + vehicle.getDom());
	    	            System.out.println();
	    	        }
	    	    }

	    }
	


