	package com.aurionpro.model;

public class Circle {
	private double radius;
	private ColorType color;
	private BorderType border;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public ColorType getColor() {
		return color;
	}
	public void setColor(ColorType color) {
		this.color = color;
	}
	public BorderType getBorder() {
		return border;
	}
	public void setBorder(BorderType border) {
		this.border = border;
	}
	public double areaofCircle() {
		return Math.PI*radius*radius;
	}
	public double PerimeterofCircle() {
		return 2*Math.PI*radius;
	}
}
