package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Circle;
public class RectangleTest {
	public static void main(String[] args){
		Circle rectangle = new Circle();
		getUserInputForHeightandWidth(rectangle);
		printAreaAndPerimeter(rectangle);             
		System.out.println("-------");
		Circle rectangle2 = new Circle();
		getUserInputForHeightandWidth(rectangle2);
		printAreaAndPerimeter(rectangle2);
	}
	private static void getUserInputForHeightandWidth(Circle rectangle) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height and width of the recatangle");
		rectangle.setHeight(sc.nextDouble());
		rectangle.setWidth(sc.nextDouble());
		System.out.println("Enter the color of rectangle");
		rectangle.setColor(ColorType.valueOf(sc.next().toUpperCase()));
		}
	private static void printAreaAndPerimeter(Circle rectangle) {
		System.out.println("height of rect.:"+rectangle.getHeight());
		System.out.println("Width of rect.:"+rectangle.getWidth());
		System.out.println("area of rectangle:"+rectangle.areaofRectangle());
		System.out.println("perimeter:"+rectangle.perimeterOfRectangle());
		System.out.println("Color of the rectangle is :"+rectangle.getColor());
	}
	
}
