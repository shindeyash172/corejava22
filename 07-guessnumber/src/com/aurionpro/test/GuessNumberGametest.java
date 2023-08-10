package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.GuessNumberGame;
public class GuessNumberGametest {
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  
	  GuessNumberGame game=new GuessNumberGame();
	  game.playgame();
	  
	  System.out.println("Want play again :");
	  String str=sc.next().toLowerCase();
	  if(str.equals("yes")) {
	   game.playgame();
	  }
	  
	  
	  
	 
	 }

	}



