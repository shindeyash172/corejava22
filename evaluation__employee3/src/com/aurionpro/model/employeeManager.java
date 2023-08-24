package com.aurionpro.model;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;
	import java.util.stream.Collectors;

	public class employeeManager {

		public static void main(String[] args) {
			
			String serializableFilename = "D:\\Serialize_files\\EmpTest.txt";
		    String textFilename = "D:\\Serialize_files\\emp.txt";
		    
		    List<Employee> emps;
		    if (isSerializableFileEmpty(serializableFilename)) {
		        emps = fetchEmployeeDetails(textFilename);
		        serializeEmployeesToFile(emps, serializableFilename);
		    } else {
		        emps = deserializeEmployeesFromFile(serializableFilename);
		    }

			List<Employee> employees = distinctEmployeeList(emps);
			printAllEmployees(employees);
			System.out.println("---------------------------------");

			Map<Integer, Long> departmentEmployeeCounts = countEmployeesByDepartment(employees);
			System.out.println("The number of employees per each department are :");
			printEmployeeCountsByDepartment(departmentEmployeeCounts);
			System.out.println("----------------------------------");
			
//			addEmployeeAndSerialize(employees, new Employee(7700, "Omkar", "'CLERK'", 7839, null, 2700.0, 0.0, 30),
//					serializableFilename);
//			printAllEmployees(employees);
//			System.out.println("----------------------------------------------");
			
			
			Employee employee = findManager(emps, 7369);
			System.out.println("The manager name for the given employee ID is ");
			System.out.println("Manager: " + employee.getName());
			System.out.println("-------------------------------------------------");

			Double totalSalary = calculateTotalSalary(employees);
			System.out.println("The total salary of all employees is : " + totalSalary);
			System.out.println("-----------------------------------------------------");

			Map<Integer, Employee> maxPaidForEachDepartment = findHighestPaidInEachDepartment(employees);
			System.out.println("The maximum paid in each department are :");
			maxPaidForEachDepartment.forEach((key, value) -> System.out.println("Department " + key + " : " + value));
			System.out.println("-----------------------------------------------------");

			Map<String, Employee> maxPaidForEachRole = findHighestPaidInEachRole(employees);
			System.out.println("The maximum paid for each roles are as follows :");
			maxPaidForEachRole.forEach((key, value) -> System.out.println(key + " : " + value));
			System.out.println("--------------------------------------------------------");

			Employee maxComission = findSalesmanWithHighestCommission(employees);
			System.out.println("The employee with maximum commission is : \n" + maxComission);

			// Unable to put correct form for input and end date ...
			//The method is error free
			
			// List<Employee>
			// employeesJoinedBetween=findEmployeesJoinedBetween(employees,new
			// LocalDate(1981-05-01),new LocalDate(1982-12-9));
			// employeesJoinedBetween.forEach(System.out::println);

		}
		
		public static boolean isSerializableFileEmpty(String filename) {
		    File file = new File(filename);
		    return file.length() == 0;
		}
		
		public static Employee findSalesmanWithHighestCommission(List<Employee> employees) {
			return employees.stream().filter(employee -> employee.getRole().equalsIgnoreCase("'Salesman'"))
					.max(Comparator.comparingDouble(Employee::getCommission)).orElse(null);
		}

		public static List<Employee> findEmployeesJoinedBetween(List<Employee> employees, LocalDate startDate,
				LocalDate endDate) {
			return employees.stream().filter(
					employee -> employee.getJoiningDate().isAfter(startDate) && employee.getJoiningDate().isBefore(endDate))
					.collect(Collectors.toList());
		}

		public static Map<Integer, Employee> findHighestPaidInEachDepartment(List<Employee> employees) {
			return employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors
					.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		}

		public static Map<String, Employee> findHighestPaidInEachRole(List<Employee> employees) {
			return employees.stream().collect(Collectors.groupingBy(Employee::getRole, Collectors
					.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		}

		public static double calculateTotalSalary(List<Employee> employees) {
			return employees.stream().mapToDouble(Employee::getSalary).sum();
		}

		public static Employee findManager(List<Employee> employees, int employeeId) {
			Employee employee = employees.stream().filter(e -> e.getId() == employeeId).findFirst().orElse(null);

			if (employee != null) {
				int managerId = employee.getManagerId();
				return employees.stream().filter(e -> e.getId() == managerId).findFirst().orElse(null);
			}
			return null;
		}

		public static void addEmployeeAndSerialize(List<Employee> employees, Employee newEmployee, String filename) {
			employees.add(newEmployee);
			serializeEmployeesToFile(employees, filename);
		}

		public static void serializeEmployeesToFile(List<Employee> employees, String filename) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
				oos.writeObject(employees);
				System.out.println("Employees serialized and written to file.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public static List<Employee> deserializeEmployeesFromFile(String filename) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
				return (List<Employee>) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
				return new ArrayList<>();
			}
		}

		private static List<Employee> distinctEmployeeList(List<Employee> emps) {

			return emps.stream().distinct().collect(Collectors.toList());
		}

		public static void printEmployeeCountsByDepartment(Map<Integer, Long> departmentEmployeeCounts) {
			departmentEmployeeCounts.forEach((departmentId, count) -> System.out
					.println("Department " + departmentId + ": " + count + " employees"));
		}

		public static Map<Integer, Long> countEmployeesByDepartment(List<Employee> employees) {
			return employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));
		}

		private static void printAllEmployees(List<Employee> emps) {
			emps.forEach(System.out::println);

		}

		private static List<Employee> fetchEmployeeDetails(String filename) {
			List<Employee> emps = new ArrayList<>();

			try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] fields = line.split(",");
					int id = Integer.parseInt(fields[0]);
					String name = fields[1];
					String role = fields[2];
					int managerId = validateManagerId(fields[3]);
					String[] rawDateParts = fields[4].replaceAll("'", "").split("-");
					int day = Integer.parseInt(rawDateParts[0]);
					String month = rawDateParts[1];
					int year = 1900 + Integer.parseInt(rawDateParts[2]);
					LocalDate joiningDate = LocalDate.of(year, parseMonth(month), day);
					double salary = Double.parseDouble(fields[5]);
					Double commission = validateComission(fields[6]);
					int departmentId = Integer.parseInt(fields[7]);
					Employee employee = new Employee(id, name, role, managerId, joiningDate, salary, commission,
							departmentId);
					emps.add(employee);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			return emps;
		}

		private static int validateManagerId(String id) {
			if (id.equalsIgnoreCase("Null")) {
				return 0;
			}
			return Integer.parseInt(id);
		}

		private static Double validateComission(String commisionInfo) {
			if (commisionInfo.equalsIgnoreCase("Null")) {
				return null;
			}
			return Double.parseDouble(commisionInfo);
		}

		private static int parseMonth(String monthAbbreviation) {
			switch (monthAbbreviation.toUpperCase()) {
			case "JAN":
				return 1;
			case "FEB":
				return 2;
			case "MAR":
				return 3;
			case "APR":
				return 4;
			case "MAY":
				return 5;
			case "JUN":
				return 6;
			case "JUL":
				return 7;
			case "AUG":
				return 8;
			case "SEP":
				return 9;
			case "OCT":
				return 10;
			case "NOV":
				return 11;
			case "DEC":
				return 12;
			default:
				throw new IllegalArgumentException("Invalid month abbreviation: " + monthAbbreviation);
			}

		}
	}

	// 1. Find all employees in a department
	// 2. Find count of employees in each department
	// 3. Add/ delete an employee in the list and serialize and write to file
	// 4. Deserialize employees from the file and update the list
	// 5. Find the immediate manager of the employee
	// 6. Find highest paid employee in each department
	// 7. Find highest paid employee on each role
	// 8. Find employees joined between two dates
	// 9. Find salesman with highest commission
	// 10. Find sum of salary of all employees

}
