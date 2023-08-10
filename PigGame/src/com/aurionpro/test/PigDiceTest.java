package com.aurionpro.test;

import com.aurionpro.model.PigGameDice;

public class PigDiceTest {


	public static void main(String[] args) {
		System.out.println("PIG DICE GAME");
		System.out.println("* See how many turns it takes you to get to 20");
		System.out.println("* Turn ends when you hold or roll a 1");
		System.out.println("* If you roll a 1, you lose all points for the turn");
		System.out.println("* If you hold, you save all points for the turn\n");
		PigGameDice pg = new PigGameDice();
		System.out.println( "TURN " + pg.getTurns() );
		while ((pg.getScore() + pg.getTurnScore()) < 20) {
			pg.runGame();
		}
		pg.updateTotalScore();
		System.out.println("\n Congratulations!!! You Won " );
		System.out.println("\nTotal Score : " + pg.getScore());
		System.out.println("You finished in " + pg.getTurns()+ " turns.");

	}

	

}