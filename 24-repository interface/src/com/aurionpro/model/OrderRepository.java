package com.aurionpro.model;

public class OrderRepository implements Irepository {

	@Override
	public void create() {
		System.out.println("order created");

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("order read");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("order updated");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("order deleted");
	}

}
