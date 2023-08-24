package com.aurionpro.test; 
 
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
 
import com.aurionpro.model.Student; 
 
public class studentTest { 
 
 public static void main(String[] args) { 
   List<Student> students = Arrays.asList( 
              new Student(1, "yash", 90.9, Arrays.asList("Read", "Dance", "sing")), 
              new Student(2, "akash", 30.9, Arrays.asList("swim", "gym")), 
              new Student(3, "asdf", 60.9, Arrays.asList("gym", "Dance", "swim")), 
              new Student(4, "yash shinde", 60.9, Arrays.asList("Read", "cooking")) 
               
          ); 
    
    
 
     List<Double> percentage = students.stream() 
       .map((student) -> student.getPercentage()) 
       .distinct() 
       .collect(Collectors.toList()); 
     System.out.println(percentage); 
   
      
     List<String> hobies = students.stream() 
       .map((hobbies) -> hobbies.getHobbies())
       .flatMap((list)->list.stream())
       .distinct() 
       .collect(Collectors.toList()); 
     System.out.println(hobies); 
 
 } 
 
}