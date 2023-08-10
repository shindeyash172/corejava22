package com.aurionpro.model;

import java.io.Serializable;

public class Developer extends Employee {

	private double pa;
	private double ota;

	public Developer(int id, String name, double basic) {
		super(id, name, basic);
		this.pa = pa = getBasic() * 0.3;
		this.ota = ota = getBasic() * 0.2;
	}

	@Override
	public double calculateMonthlySalary() {
		return super.getBasic() + pa + ota;
	}

	@Override
	public String toString() {
		return "Developer [pa=" + pa + ", ota=" + ota + "]";
	}

	@Override
	public double calculateAnnualCTC() {
		return (super.getBasic() + pa + ota) * 12;
	}

}
