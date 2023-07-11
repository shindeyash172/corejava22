package com.aurionpro.model;

public class Circle {
	private double height;
	private double width;
	
	private ColorType color;
	
		private String validateColour(String  value) {
			   
			  
			   if(value.toLowerCase().equals("blue"))
			    {return "Blue"  ;
			    }
			  else if(value.toLowerCase().equals("green")) {
			   return "Green";
			  }
			  
			  else 
			   {
			   return "Red";
			   }
}	

	public ColorType getColor() {
		return color;
	}
	public void setColor(ColorType color) {
		this.color = color;
	}
	
	
	private double validate(double value) {
		if(value<1)
			{return 1;
			}
		else if(value>100) 
		{ return 100;
		}
		
		else
			{return value;
					
			}
			
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		
	 this.height=validate(height);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		
		this.width = validate(width);
	}
	
	
	public double areaofRectangle() {
		return height*width;
	}
	public double perimeterOfRectangle() {
		return 2*height+2*width;
	}
}