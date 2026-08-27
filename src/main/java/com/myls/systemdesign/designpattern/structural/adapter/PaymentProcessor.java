package com.myls.systemdesign.designpattern.structural.adapter;

public interface PaymentProcessor {

	void processPayment(double amount, String currency);

	boolean isPaymentSuccessful();

	int getTransactionId();
}
