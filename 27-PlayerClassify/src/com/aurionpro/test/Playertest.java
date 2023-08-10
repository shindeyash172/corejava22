package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Player;

public class Playertest {

	public static void main(String[] args) {
		Player[] players= {
				new Player(1, "yash", 200, 100000,50),
				new Player(2, "akash", 55, 3500,0),
				new Player(3, "rohit", 190, 6000,2),
				new Player(4, "nitesh", 30, 2000, 40),
				new Player(5, "prakash", 100, 1500,200)
		};
		
		ClassifyPlayers obj=new ClassifyPlayers();
		
		Player[] aListers = obj.getAlistPlayers(players);
		printPlayers(aListers);
		System.out.println("----------------");
		Player[] bListers = obj.getBlistPlayers(players);
		printPlayers(bListers);
		System.out.println("--------------");
		Player[] cListers = obj.getCListers(players);
		printPlayers(cListers);
		System.out.println("--------------");
	}

	private static void printPlayers(Player[] aListers) {	
		for(Player p:aListers) {
			System.out.println(p);
		}
	}

}
