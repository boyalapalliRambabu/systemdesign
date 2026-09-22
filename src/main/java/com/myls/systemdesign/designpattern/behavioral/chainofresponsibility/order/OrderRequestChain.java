package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public class OrderRequestChain {

	String token;
	String userRole;
	double amount;

	public OrderRequestChain(String token, String userRole, double amount) {
		this.token = token;
		this.userRole = userRole;
		this.amount = amount;
	}
}
