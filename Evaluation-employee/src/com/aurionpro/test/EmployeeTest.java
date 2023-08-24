package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.util.EmployeeUtil;

public class EmployeeTest {

	static int count = 0;

	public static void main(String[] args) {
		
		EmployeeUtil employeeUtil = new EmployeeUtil();
		System.out.println(employeeUtil.getEmployeeList());
employeeUtil.addEmployee(new Employee(2010, "Yash", "Manager", 3000, 7499, 0, 30));
		System.out.println("----------------");
//		System.out.println(employeeUtil.getEmployeeList());
//	//
//		employeeUtil.deleteEmployeeById(8010);
//		employeeUtil.deleteEmployeeById(8010);
//System.out.println("-------");
//System.out.println(employeeUtil.getEmployeeList());
//		employeeUtil.employeeIndepartment();
		employeeUtil.highestCommissionSalesman();
//		 employeeUtil.highestPaidEmployeeInEachDepartment();
//		 employeeUtil.deleteEmployeeById(8010);
//		 System.out.println(employeeUtil.getEmployeeList());
//		 System.out.println(employeeUtil.TotalEmployee());

//	employeeUtil.findEmployeeById(8010);
//		 employeeUtil.highestPaidInEachRole();
//		 
	}
	

}
