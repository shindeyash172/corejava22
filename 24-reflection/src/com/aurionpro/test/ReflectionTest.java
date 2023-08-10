package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class name : ");
        String test = sc.nextLine();
        
        Class<?> className = Class.forName(test);

        Field[] declaredFields = className.getDeclaredFields(); // get fields
        for (Field f : declaredFields) {
            System.out.println(f);
        }

        Constructor<?>[] constructors = className.getConstructors(); // get constructors
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        Method[] methods = className.getMethods(); // get methods
        for (Method m : methods) {
            System.out.println(m);
        }
        
//        Constructor<?>[] constructor2 = SavingAccount.class.getConstructor();
//        for(Constructor c: constructor2) {
//        	System.out.println(c);
//        }
//        System.out.println(SavingAccount.class.getSuperclass());
//    }
}
}
