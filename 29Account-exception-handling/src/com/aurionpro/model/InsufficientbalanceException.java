package com.aurionpro.model;

public class InsufficientbalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	private Account acc;
	private double amount;
	public InsufficientbalanceException(String message) {
		super(message);
		this.acc=acc;
		this.amount=amount;
		}
	@Override
	public String getMessage() {
		String message ="Transaction Failed";
		message+="Withdraw amount"+amount;
		message+="Account Balance"+acc.getBalance();
		return super.getMessage();
	}
}
