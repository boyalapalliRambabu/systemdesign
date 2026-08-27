package com.myls.systemdesign.designpattern.structural.adapter;

public class CheckoutService {

	private PaymentProcessor paymentProcessor;

	public CheckoutService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	public void checkOut(double amount, String currency) {

		paymentProcessor.processPayment(amount, currency);
		if (paymentProcessor.isPaymentSuccessful()) {
			System.out.println(paymentProcessor.getTransactionId());
		}

	}

}
