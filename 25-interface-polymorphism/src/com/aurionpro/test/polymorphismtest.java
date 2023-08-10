package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class polymorphismtest {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		
		System.out.println("----------------------");
		atTheParty(boy);
		atTheMovies(boy); 
	}

	private static void atTheMovies(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}

	private static void atTheParty(IMannerable obj) {
		obj.WelcomeGreet();
		obj.DepartGreet();
	}

}