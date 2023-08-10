package com.aurionpro.model;

public class LineItems {
	private String Name;
	private int quantity;
	private double unitPrice;
	private double totalCost;
	
public LineItems(int id, String name, int quantity, double unitPrice ) {
		
		this.id = id;
		this.Name = Name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalCost = calculateTotalPrice();
	}
	public double calculateTotalPrice(){
	return quantity*unitPrice;
}
	@Override
	public String toString() {
		return "LineItems [Name=" + Name + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalCost="
				+ totalCost + ", id=" + id + "]";
	}
	private int id;
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
}
