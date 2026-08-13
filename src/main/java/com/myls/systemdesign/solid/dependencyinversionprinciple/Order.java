package com.myls.systemdesign.solid.dependencyinversionprinciple;

public class Order {

	private String id;
	private String product;
	private double amount;

	public Order() {
	}

	public Order(String id, String product, double amount) {
		this.id = id;
		this.product = product;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}