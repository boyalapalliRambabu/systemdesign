package com.myls.systemdesign.designpattern.structural.adapter.springboot;

import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceLatest {

	private final PaymentProcessorLatest paymentProcessorLatest;

	public CheckoutServiceLatest(PaymentProcessorLatest paymentProcessorLatest) {
		this.paymentProcessorLatest = paymentProcessorLatest;
	}

	public PaymentResponse chechOut(PaymentRequest req) {

		return paymentProcessorLatest.processPayment(req);
	}

}
