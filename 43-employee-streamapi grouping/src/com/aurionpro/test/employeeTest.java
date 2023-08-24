package com.aurionpro.test;

import com.aurionpro.model.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class employeeTest {

    public static void main(String[] args) {
        List<employee> employees = Arrays.asList(
                new employee(1, "yash", "developer", 102500),
                new employee(2, "asdf", "manager", 40000),
                new employee(3, "yash", "HR", 30000),
                new employee(4, "yash", "developer", 25000),
                new employee(5, "yash", "HR", 35000)
        );

        Map<String, List<employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(employee::getDepartment));

        System.out.println("Employees grouped by department:");
        System.out.println(collect);

        double totalSalary = employees.stream()
                .mapToDouble(employee::getSalary)
                .sum();
        System.out.println("Total salary : " + totalSalary);


        double countHighSalary = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .count();
        System.out.println("Number of emp with salary > 50000: " + countHighSalary);

        double maxSalary = employees.stream()
                .mapToDouble(employee::getSalary)
                .max()
                .orElse(0);
        System.out.println("Maximum salary: " + maxSalary);
//
        
      double minSalary = employees.stream()
                .mapToDouble(employee::getSalary)
                .min()
                .orElse(0);
        System.out.println("Minimum salary: " + minSalary);
    

   
//     List<Double> percentage = students.stream() 
//       .map((student) -> student.getPercentage()) 
//       .distinct() 
//       .collect(Collectors.toList()); 
//     System.out.println(percentage); 
//   
//      
//     List<String> hobies = students.stream() 
//       .map((hobbies) -> hobbies.getHobbies())
//       .flatMap((list)->list.stream())
//       .distinct() 
//       .collect(Collectors.toList()); 
//     System.out.println(hobies); 
// 
 } 
 
}