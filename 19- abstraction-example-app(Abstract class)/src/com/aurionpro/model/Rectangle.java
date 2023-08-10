package com.aurionpro.model;

public class Rectangle extends Shape{
	public Rectangle(ColorType color, BorderType border, double height, double width) {
		super(color, border);
		this.height=height;
		this.width=width;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	private double height;
	private double	width;
	@Override
	public double CalculateArea() {
		return this.height*this.width;
	}
}
