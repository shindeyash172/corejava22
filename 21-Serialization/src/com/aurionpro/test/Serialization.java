package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		Student s1 = new Student("Yash", 5);

		String filename = "D:\\java 22\\serialization\\Yash.txt";

		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);

			oos.close();
			fos.close();
			System.out.println("Object saved in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
