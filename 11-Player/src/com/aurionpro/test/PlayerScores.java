package com.aurionpro.test;

import com.aurionpro.model.CountryType;
import com.aurionpro.model.Player;

public class PlayerScores{
	
	public static void main (String [] args) {
	Player[] player = new Player[12];
	player[0] = new Player("Yash",20,"IND",11200,22,50);
	player[1] = new Player("Nitesh",22,"IND",1200,2,2);
	player[2] = new Player("raj",25,"IND",10000,10,2);
	player[3] = new Player("akash",25,"AUS",1120,0,5);
	player[4] = new Player("rohit",26,"AUS",2000,1,10);
	player[5] = new Player("rohan",20,"AUS",20000,20,50);
	player[6] = new Player("Cook",35,"ENG",2100,4,2);
	player[7] = new Player("Kohli",32,"ENG",2677,63,2);
	player[8] = new Player("Rohi S",21,"ENG",1120,22,2);
	player[9] = new Player("Omkar",23,"PAK",1100,4,2);
	player[10] = new Player("Prakash",24,"PAK",1200,2,2);
	player[11] = new Player("Sachin",29,"PAK",11206,24,2);
	//for (int i = 0; i < player.length; i++) {
	//	System.out.println(player[i]);
	CountryType[] countries=CountryType.class.getEnumConstants();
	
	
	System.out.println("player with highestruns"+playerhighestruns(player));
	System.out.println("playerwithlowest runs"+playerlowestruns(player));
	System.out.println("playerwithhighest fifties"+playerhighestfifties(player));
	System.out.println("playerwithhighest hundreds"+playerhighesthundreds(player));
	System.out.println("youngerplayer"+playeryoungest(player));
	System.out.println("oldestplayer"+playeroldest(player));
//	System.out.println("Countries"+findPlayersWithHighestRuns(countries));{
		for(int i=0;i<countries.length;i++) {
			Player players=findPlayersWithHighestRuns(player,countries[i]);
			System.out.println(" Highest run scorer for "+countries[i]+" is :"+players);
	}
	}
	
	
	
private static Player playerhighestruns(Player[] player) {
	Player maxPlayer = player[0];
	for (int i = 1; i < player.length; i++) {
		if(player[i].getRunsScored() > maxPlayer.getRunsScored()) {
			maxPlayer = player[i];
		}
	}
	return maxPlayer;
}

private static Player playerlowestruns(Player[] player) {
	Player minPlayer = player[0];
	for (int i = 0; i < player.length; i++) {
		if(player[i].getRunsScored()<minPlayer.getRunsScored()) {
			minPlayer=player[i];
		}
	}
	
	return minPlayer;
	}
private static Player playerhighestfifties(Player[] player) {
	Player maxfifties = player[0];
	for (int i = 1; i < player.length; i++) {
		if(player[i].getFifties() > maxfifties.getFifties()) {
			maxfifties = player[i];
		}
	}
	return maxfifties;
}
private static Player playerhighesthundreds(Player[] player) {
	Player maxhundreds = player[0];
	for (int i = 1; i < player.length; i++) {
		if(player[i].getHundreds() > maxhundreds.getHundreds()) {
			maxhundreds = player[i];
		}
	}
	return maxhundreds;
}
private static Player playeryoungest(Player[] player) {
	Player youngest = player[0];
	for (int i = 0; i < player.length; i++) {
		if(player[i].getAge() < youngest.getAge()) {
			youngest = player[i];
		}
	}
	return youngest;
	
}
private static Player playeroldest(Player[] player) {
	Player oldest = player[0];
	for (int i = 0; i < player.length; i++) {
		if(player[i].getAge() > oldest.getAge()) {
			oldest = player[i];
		}
	}
	return oldest;
}
private static Player findPlayersWithHighestRuns(Player[] players, CountryType country) {
	
	Player maxPlayer = null;

	for (int i = 0; i < players.length; i++) {
		if(players[i].getCountry().equals(country) && maxPlayer==null) {
			maxPlayer=players[i];
		}
		if(maxPlayer!=null) {
			if (players[i].getRunsScored() > maxPlayer.getRunsScored() && players[i].getCountry().equals(country)) {
				maxPlayer = players[i];
			}
		}
		

	}
	return maxPlayer;
}
}




