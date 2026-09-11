package com.myls.systemdesign.designpattern.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	public String processPayment(String customerId, double amount) {
		System.out.println("Processing payment of ₹" + amount + " for customer " + customerId);

		// Simulating payment
		return "PAY-" + System.currentTimeMillis();
	}

	public void refundPayment(String paymentId) {

		System.out.println("Refunding payment: " + paymentId);
	}
}
