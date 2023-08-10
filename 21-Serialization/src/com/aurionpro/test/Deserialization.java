package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        String filename = "D:\\java 22\\serialization\\Yash.txt";

        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student obj = (Student) ois.readObject();
            System.out.println(obj.getRollno());
            System.out.println(obj.getName());

            ois.close();
            fis.close();
            System.out.println("Object read from file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
