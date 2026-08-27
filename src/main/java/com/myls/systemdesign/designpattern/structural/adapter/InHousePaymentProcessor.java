package com.myls.systemdesign.designpattern.structural.adapter;

// No issue this is the existing payment extension
public class InHousePaymentProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount, String currency) {
	}

	@Override
	public boolean isPaymentSuccessful() {

		return false;
	}

	@Override
	public int getTransactionId() {
		return 0;
	}

}
