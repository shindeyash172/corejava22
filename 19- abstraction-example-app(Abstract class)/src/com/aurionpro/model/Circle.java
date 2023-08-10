package com.aurionpro.model;

public class Circle extends Shape {
	private double radius;
	public Circle(ColorType color, BorderType border,double radius) {
		super(color, border);
		this.radius=radius;
	}

@Override
public double CalculateArea() {
	return (3.14*this.radius*this.radius);
}

@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}
}
