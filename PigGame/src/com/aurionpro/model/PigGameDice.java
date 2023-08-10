package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class PigGameDice {


public int turns = 1;
public int score;
public int turnScore;

public int getTurns() {
	return turns;
}
public int getScore() {
	return score;
}
public int getTurnScore() {
	return turnScore;
}

public int numberGenerator() {
	Random random = new Random();
	int die = 1 + random.nextInt(6);
	return die;
}

public void updateTurnScore(int die) {
	turnScore += die;
}

public void updateTurns() {
	turns++;
}

public void updateTotalScore() {
	score = score + turnScore;
}

public void runGame() {
	System.out.print("Roll or hold? (r/h): ");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	if (s.equalsIgnoreCase("r")) {
		roll();
	}
	else if (s.equalsIgnoreCase("h"))
		hold();
	else
		runGame();
}

private void roll() {
	int die = numberGenerator();
	System.out.println(die);
	if (die == 1) {
		turnScore = 0;
		printDetails();
		updateTurns();
		System.out.println("Turn Over, No Score.\n");
		System.out.println( "TURN " + turns );
	}
	else
		updateTurnScore(die);
}

private void hold() {
	updateTotalScore();
	printDetails();
	updateTurns();
	turnScore = 0;
	System.out.println("TURN " + turns );
	
}

public void printDetails() {
//	System.out.println("Turns : " +pg.getTurns());
	System.out.println("\nTurn Score : " + turnScore);
	System.out.println("Total Score : " + score + "\n");
}
}
