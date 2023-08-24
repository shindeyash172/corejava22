package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class filereader {
    public static void main(String[] args) {
        String fileName ="C:\\Users\\yash.shinde\\Desktop\\123.txt";

//        try (FileReader fileReader = new FileReader(fileName);
//             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            
            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                stream.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        } catch (IOException e) {
//            e.printStackTrace();
//}
    }

