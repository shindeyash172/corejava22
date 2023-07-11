package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;
public class RectangleTest {
 public static void main(String[] args){
  
//  for(int i=0;i<3;i++) {
//   rectangle [i]=new Rectangle();
//   getUserInputForHeightandWidth(rectangle[i]);
//   printAreaAndPerimeter(rectangle[i]);
//   
//  }
  Rectangle obj= new Rectangle();
  printAreaAndPerimeter(obj);
  Rectangle obj1= new Rectangle(10,20);
  printAreaAndPerimeter(obj1);

  Rectangle obj2= new Rectangle(19,20,ColorType.valueOf("BLUE"));
  printAreaAndPerimeter(obj2);

    
 
  
  System.out.println("-------");
  
  
//  Rectangle rectangle2 = new Rectangle();
//  getUserInputForHeightandWidth(rectangle2);
//  printAreaAndPerimeter(rectangle2);
  
  
  
 
 }
 
 
 
 
 
 
 private static void getUserInputForHeightandWidth(Rectangle rectangle) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the height and width of the recatngle");
  rectangle.setHeight( sc.nextDouble());
  System.out.println("enter the width of the recatngle");
  rectangle.setWidth( sc.nextDouble());
  System.out.println("enter the Colour of the recatngle");
  try {
  rectangle.setColor(ColorType.valueOf(sc.next().toUpperCase()));
  }
  catch (IllegalArgumentException e) {
   rectangle.setColor(ColorType.RED);
  }
  
  
 }
 private static void printAreaAndPerimeter(Rectangle rectangle) {
  System.out.println("Hight of rectangle:"+rectangle.getHeight());
  System.out.println("Width of rectangle:"+rectangle.getHeight());
  System.out.println("Colour of rectangle:"+rectangle.getColor());
  
  System.out.println("area of rectangle:"+rectangle.areaofRectangle());
  System.out.println("perimeter:"+rectangle.perimeterOfRectangle());
 
 
 
 }
 
}

