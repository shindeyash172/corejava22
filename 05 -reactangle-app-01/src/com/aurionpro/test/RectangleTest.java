package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;
public class RectangleTest {
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle();
		getUserInputForHeightandWidth(rectangle);
		printAreaAndPerimeter(rectangle);
		System.out.println("-------");
		Rectangle rectangle2 = new Rectangle();
		getUserInputForHeightandWidth(rectangle2);
		printAreaAndPerimeter(rectangle2);
	}
	private static void getUserInputForHeightandWidth(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height and width of the recatngle");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		}
	private static void printAreaAndPerimeter(Rectangle rectangle) {
		System.out.println("area of rectangle:"+rectangle.areaofRectangle());
		System.out.println("perimeter:"+rectangle.perimeterOfRectangle());
	}
	
}
