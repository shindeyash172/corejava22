package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamtest {
    public static void main(String[] args) {
        String[] string = {"yash", "akash", "123", "234"};
//        List<String> string2 = new ArrayList<>();

//        for (int i = 0; i < string.size(); i++) {
//            String item = string.get(i);
//            if (item.length() == 3 || item.length() == 4) {
//                string2.add(item);
//                string.remove(i);
//                i--; 
//            }
//        }

       
       List<String> names = Arrays.stream(string)
        		.filter((item)->(item.length() == 3 || item.length() == 4))
        .collect(Collectors.toList());
       
       
       names.forEach((name)->System.out.println(name));
    }
}

