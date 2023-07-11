package com.aurionpro.test;
public class IncrementArray {

 public static void main(String[] args) {
  
   int arr[]=new int[] {10,20,30,40,50};
   System.out.println("Before calling method array  is : ");
   for(int i:arr) {
    System.out.print(i+" ");
   }
    incrementByOne(arr);
   System.out.println("\nAfter calling method number is : ");
   for(int i:arr) {
    System.out.print(i +" ");
   }

 }
 private static  void incrementByOne(int[] number){
	 for(int i = 0;i<number.length;i++)
	 {
		 number[i]++;
	 }
	 //for(int i:number) {
   //i++;
  
 }
}


