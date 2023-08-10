package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] employees = { new Manager(1, "Yash", 50000), new Developer(2, "Akash", 40000),
				new Accountant(3, "Prakash", 45000) };

		// Serialize employees
		serializeEmployees(employees);

		// Deserialize employees
		Employee[] deserializedEmployees = deserializeEmployees();
		if (deserializedEmployees != null) {
			for (Employee employee : deserializedEmployees) {
				employee.printSalarySlip();
			}
		}
	}

	private static void serializeEmployees(Employee[] employees) {
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\yash.shinde\\Desktop\\Employee.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(employees);
			System.out.println("Employees serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Employee[] deserializeEmployees() {
		try (FileInputStream fis = new FileInputStream("C:\\Users\\yash.shinde\\Desktop\\Employee.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Object obj = ois.readObject();
			if (obj instanceof Employee[]) {
				return (Employee[]) obj;
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}

// package com.aurionpro.test;
//
// import com.aurionpro.model.Accountant;
// import com.aurionpro.model.Developer;
// import com.aurionpro.model.Employee;
// import com.aurionpro.model.Manager;
//
//
// public class EmployeeTest {
// public static void main(String[] args) {
// Employee[] employees = {
// new Manager(1, "Yash", 50000),
// new Developer(2, "Akash", 40000),
// new Accountant(3, "Prakash", 60000)
// };
//
// for (Employee employee : employees) {
// employee.printSalarySlip();
// }
// }
//
//
// @Override
// public String toString() {
// return "EmployeeTest []";
// }
// }
//
//
//
