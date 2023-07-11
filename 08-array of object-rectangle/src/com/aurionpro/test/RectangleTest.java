package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;
public class RectangleTest {
	public static void main(String[] args){
		
		Rectangle[] rectangle = new Rectangle[2];
		for(int i=0;i<2;i++) {
			rectangle[i] = new Rectangle();
			getUserInputForHeightandWidth(rectangle[i]);
			printAreaAndPerimeter(rectangle[i]);             
			}
		
	}
	private static void getUserInputForHeightandWidth(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height and width of the recatangle");
		rectangle.setHeight(sc.nextDouble());
		rectangle.setWidth(sc.nextDouble());
		System.out.println("Enter the color of rectangle");
		rectangle.setColor(ColorType.valueOf(sc.next().toUpperCase()));
		}
	private static void printAreaAndPerimeter(Rectangle rectangle) {
		System.out.println("height of rect.:"+rectangle.getHeight());
		System.out.println("Width of rect.:"+rectangle.getWidth());
		System.out.println("area of rectangle:"+rectangle.areaofRectangle());
		System.out.println("perimeter:"+rectangle.perimeterOfRectangle());
		System.out.println("Color of the rectangle is :"+rectangle.getColor());
	}
	
}
