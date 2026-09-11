package com.myls.systemdesign.designpattern.behavioral.observer.springboot;

import java.math.BigDecimal;

public class OrderLatest {
	private final String orderId;
	private final String customerEmail;
	private final BigDecimal amount;

	public OrderLatest(String orderId, String customerEmail, BigDecimal amount) {

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

	public BigDecimal getAmount() {
		return amount;
	}
}
