package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public class PurchaseRequest {

	private double amount;

	public PurchaseRequest(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PurchaseRequest [amount=" + amount + "]";
	}

}
