package com.aurionpro.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private int empId;
    private String name;
    private String job;
    private int managerId;
    private Date joiningDate;
    private double salary;
    private double commission;
    private int departmentId;
    
    public Employee(int empId, String name, String job, int managerId, Date joiningDate, double salary,
            double commission, int departmentId) {
        this.empId = empId;
        this.name = name;
        this.job = job;
        this.managerId = managerId;
        this.joiningDate = joiningDate;
        this.salary = salary;
        this.commission = commission;
        this.departmentId = departmentId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getManagerId() {
        return managerId;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public double getCommission() {
        return commission;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", job=" + job + ", managerId=" + managerId
                + ", joiningDate=" + joiningDate + ", salary=" + salary + ", commission=" + commission
                + ", departmentId=" + departmentId + "]";
    }
}
