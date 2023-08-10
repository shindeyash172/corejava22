package com.aurionpro.model;

import java.io.Serializable;

public class Manager extends Employee {
	private double hra;
	private double da;
	private double ta;

	public Manager(int id, String name, double basic) {
		super(id, name, basic);
		this.hra = hra = getBasic() * 0.25;
		this.da = da = getBasic() * 0.15;
		this.ta = ta = getBasic() * 0.1;
	}

	public Manager() {
		super(0, "", 0); // Call the superclass constructor with dummy values
	}

	@Override
	public String toString() {
		return "Manager [hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}

	@Override
	public double calculateMonthlySalary() {
		return super.getBasic() + hra + da + ta;

	}

	@Override
	public double calculateAnnualCTC() {
		return (super.getBasic() + hra + da + ta) * 12;
	}

}
