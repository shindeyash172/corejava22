package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class Shapetest {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(ColorType.BLUE, BorderType.DASH, 10,20);
		rec.CalculateArea();
		System.out.println(rec.CalculateArea());
		Circle circ = new Circle (ColorType.RED,BorderType.DOT , 2);
		circ.CalculateArea();
		System.out.println(circ.CalculateArea());
		System.out.println(rec.getBorder());
		System.out.println(rec.getColor());
	}
}
