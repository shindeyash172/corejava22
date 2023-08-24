package com.aurionpro.model;

import java.util.Date;
import java.util.Scanner;

public class EmployeeController {
    private employeeManager manager;
    private Scanner sc = new Scanner(System.in);

    public EmployeeController() {
        this.manager = new employeeManager();
    }

    public void setEmployee(Employee employee) {
        this.manager.addEmployee(employee);
    }

    private void displayMenu() {
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Exit");
    }

    public void start() {
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Employee newEmployee = getEmployeeValues();
                    manager.addEmployee(newEmployee);
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private Employee getEmployeeValues() {
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("Enter Job: ");
        String job = sc.next();
        System.out.print("Enter Manager ID: ");
        int managerId = sc.nextInt();
        System.out.print("Enter Joining Date (in format dd-mm-yyyy): ");
        String joiningDateStr = sc.next();
      
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Commission: ");
        double commission = sc.nextDouble();
        System.out.print("Enter Department ID: ");
        int departmentId = sc.nextInt();

        // Create and return a new Employee instance
        return new Employee(empId, name, job, managerId, joiningDate, salary, commission, departmentId);
    }

    private void displayAllEmployees() {
        System.out.println("List of Employees:");
        for (Employee employee : manager.getAllEmployees()) {
            System.out.println("Employee Id: " + employee.getEmpId());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Job: " + employee.getJob());
            System.out.println("ManagerId: " + employee.getManagerId());
            System.out.println("JoiningDate: " + employee.getJoiningDate());
            System.out.println("Employee Salary: " + employee.getSalary());
            System.out.println("Commision: " + employee.getCommission());
            System.out.println("Employee Department: " + employee.getDepartmentId());
            System.out.println();
        }
    }
}
