package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class CircleTest {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Scanner sc=new Scanner(System.in);
  Circle circle=new Circle();
  System.out.println("Enter radius of circle");
  circle.setRadius(sc.nextDouble());
  System.out.println("Enter Colour  of circle");
  try {
     circle.setColor(ColorType.valueOf(sc.next().toUpperCase()));
     }
     catch (IllegalArgumentException e) {
      circle.setColor(ColorType.RED);
     }
  System.out.println("Enter BorderType of circle");
  try {
   circle.setBorder(BorderType.valueOf(sc.next().toUpperCase()));
     }
     catch (IllegalArgumentException e) {
      circle.setBorder(BorderType.SOLID);
     }
  
  printAreaAndPerimeter(circle);
  
  

 }
 private static void printAreaAndPerimeter(Circle cr) {
   System.out.println("Hight of rectangle:"+cr.getRadius());
  System.out.println("Width of rectangle:"+cr.getBorder());
  System.out.println("Colour of rectangle:"+cr.getColor());
   
   System.out.println("area of circle :"+cr.areaofCircle());
   System.out.println("perimeter:"+cr.PerimeterofCircle());
  
  
  
  }
 
 

}