package com.aurionpro.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeUtil {

	List<Employee> employeeList;
	private static boolean initialLoad = false;

	public EmployeeUtil() {
		this.employeeList = new ArrayList<>();
		loadEmployee();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	private void loadEmployee() {
		if (checkIfFileEmpty()
				&& !initialLoad) {
			employeeList = new EmployeeFileReader().readEmployeeFromFile("C:\\Users\\yash.shinde\\Desktop\\emp.txt");
			initialLoad = true;
		} else if (!checkIfFileEmpty()) {
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\yash.shinde\\Desktop\\empserialize.txt");
				ObjectInputStream in = new ObjectInputStream(file);
				this.employeeList = (List<Employee>) in.readObject();
				in.close();
				file.close();

				System.out.println("Object de-serialized successfully");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addEmployee(Employee employee) {
		if (findEmployeeById(employee.getId()) != null) {

			System.out.println("Emloyee Id : " + employee.getId() + "  is Already Exist");

		} else {

			employeeList.add(employee);
			saveEmployeeList();
		}

	}


	public Employee findEmployeeById(int empId) {

		for (Employee x : employeeList) {
			if (x.getId() == empId) {
				System.out.println(x);
				break;
			}
		}
		return null;
	}

	public void removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			saveEmployeeList();
		}

	}

	private void saveEmployeeList() {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\yash.shinde\\Desktop\\empserialize.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeList);

			out.close();
			file.close();

			System.out.println("Object serialized successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean checkIfFileEmpty() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\yash.shinde\\Desktop\\empserialize.txt");
			if (file.read() != -1) {
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public int TotalEmployee() {

		int count = (int) employeeList.stream().count();
		return count;

	}

	public void employeeIndepartment() {

		Map<Integer, Long> employeeInDepartment =  new HashMap<>();
		employeeInDepartment=employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));
		employeeInDepartment.forEach((department, count) -> System.out.println(" department " + department + " has " + count + " employees"));

	}

	public void highestPaidInEachRole() {
		Map<String, Employee> highestPaid = new HashMap<>();
		highestPaid=employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getRole, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

		System.out.println("Highest paid employee in each Role:");
		highestPaid.forEach((role, employee) -> {
			System.out.println("Role: " + role + ", Employee: " + employee.getName());
		});

	}

	public void highestCommissionSalesman() {
		Optional<Employee> Salesman =                       //Optional is used for object may or may not contain salesman commision
				employeeList.stream().filter(empl -> empl.getRole().equalsIgnoreCase("salesman"))
				.max(Comparator.comparingDouble(Employee::getCommission));

		Salesman.ifPresent(employee -> {
			System.out.println("Highest Commision salesman :");
			System.out.println("Name: " + employee.getName() + " Commission: " + employee.getCommission());
		});

		

	}
	public void  getManager(int id) {

		Optional<Integer> managerId = employeeList.stream().filter(empl -> empl.getId() == id)
				.map(Employee::getManagerId).findFirst();

		if (managerId.isPresent()) {
			String managerName = employeeList.stream().filter(empl -> empl.getId() == id).map(Employee::getName)
					.findFirst().orElse(null);
			 System.out.println("Manager Name :"+ managerName);
		

	}}
	public void deleteEmployeeById(int id) {

		Optional<Employee> employeeOptional = employeeList.stream()
		        .filter(empl -> empl.getId() == id)
		        .findFirst();

		if (employeeOptional.isPresent()) {
		    Employee employeeToRemove = employeeOptional.get();
		    employeeList.remove(employeeToRemove);
		    saveEmployeeList(); 
		    System.out.println("Employee with ID " + id + " removed.");
		} else {
		    System.out.println("Employee with ID " + id + " not found.");
		}

	}

	public void highestPaidEmployeeInEachDepartment() {
		Map<Integer, Employee> highestPaid = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

		System.out.println("Highest paid employees in each department:");
		highestPaid.forEach((dept, employee) -> {
			System.out.println("Department: " + dept + ", Employee: " + employee.getName());
		});

	}
	
	public void employeeJoined(String start, String end) {
	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    LocalDate startDate = LocalDate.parse(start, dateFormatter);
	    LocalDate endDate = LocalDate.parse(end, dateFormatter);

	    try {
	        List<Employee> employeesJoinedBetweenDates = employeeList.stream()
	            .filter(empl -> {
	                LocalDate joinDate =(empl.getDateOfJoining());
	                return !joinDate.isBefore(startDate) && !joinDate.isAfter(endDate);
	            })

	            .collect(Collectors.toList());


	        System.out.println("Employees joined between " + startDate + " and " + endDate + ":");
	        employeesJoinedBetweenDates.forEach(empl -> {
	            System.out.println("Name: " + empl.getName() + ", Join Date: " + empl.getDateOfJoining());
	        });
	    } catch (Exception e) {
	        System.out.println("An error occurred: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


}
