package com.aurionpro.mode;
public class person {
	private final String name;
	private final int age;
	private final float height;
	private final float weight;
	
	
	public person(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}