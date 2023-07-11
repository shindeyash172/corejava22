package com.aurionpro.model;

public class Rectangle {
	public double height;
	public double width;
	
	public double areaofRectangle() {
		return height*width;
	}
	public double perimeterOfRectangle() {
		return 2*height+2*width;
	}
}
