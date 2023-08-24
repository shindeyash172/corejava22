package com.aurionpro.model;

public class Printvalue <T>{
	private T value;

	public Printvalue(T value) {
		super();
		this.value = value;
	}
	
	public void print() {
		System.out.println("value");
	}
	@Override
	public String toString() {
		return "Printvalue [value=" + value + "]";
	}
}
