package com.aurionpro.model;

public class AddTest {
    public static void main(String[] args) {
         Iaddable obj1 = (num1, num2) -> num1 + num2;
        int sum = obj1.add(10, 50);
        System.out.println(sum);
    }
}
