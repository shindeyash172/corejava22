package com.aurionpro.model;

public class Player {
	private String name;
	private int age;
	private CountryType Country;
	private int runsScored;
	private int fifties;
	private int hundreds;
	
	public Player(String name, int age, String country, int runsScored, int fifties, int hundreds) {
		this.name = name;
		this.age = age;
		this.Country = Country;
		this.runsScored = runsScored;
		this.fifties = fifties;
		this.hundreds = hundreds;
	}
	
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", Country=" + Country + ", runsScored=" + runsScored
				+ ", fifties=" + fifties + ", hundreds=" + hundreds + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public CountryType getCountry() {
		return Country;
	}
	public void setCountry(CountryType country) {
		Country = country;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}




	
	
}
	
	

























