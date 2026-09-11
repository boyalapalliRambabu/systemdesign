package com.myls.systemdesign.designpattern.behavioral.observer;

public class Order {

	private final String orderId;
	private final String customerEmail;
	private final double amount;

	public Order(String orderId, String customerEmail, double amount) {

		this.orderId = orderId;
		this.customerEmail = customerEmail;
		this.amount = amount;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public double getAmount() {
		return amount;
	}
}