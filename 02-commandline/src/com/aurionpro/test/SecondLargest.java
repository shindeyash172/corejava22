package com.aurionpro.test;

public class SecondLargest {

	  public static  int mx(int n,int m) {
	        
		    if(n>m)return n;
		    else return m;
		   }
		 
		 public static void main(String[] args) {

		  int   second;
		   
		     int largest = second = Integer.MIN_VALUE;
		  for(int i=0;i<args.length;i++) {
		   largest = mx(largest, Integer.parseInt(args[i]));
		  }
		   
		     
		    
		  for(int i=0;i<args.length;i++)
		   
		      {
		          if (Integer.parseInt(args[i]) != largest)
		              second = mx(second, Integer.parseInt(args[i]));
		      }
		    
		          System.out.println("The second largest element is "+second);
		  }
		 

		}


