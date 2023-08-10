package com.aurionpro.model;

import java.io.Serializable;

public class Accountant extends Employee {

	private double hra;
	private double ma;

	public Accountant(int id, String name, double basic) {
		super(id, name, basic);
		this.hra = hra = getBasic() * 0.25;
		this.ma = ma = getBasic() * 0.15;
	}

	@Override
	public double calculateMonthlySalary() {
		return super.getBasic() + hra + ma;
	}

	@Override
	public String toString() {
		return "Accountant [hra=" + hra + ", ma=" + ma + "]";
	}

	@Override
	public double calculateAnnualCTC() {
		return (super.getBasic() + hra + ma) * 12;

	}

}
