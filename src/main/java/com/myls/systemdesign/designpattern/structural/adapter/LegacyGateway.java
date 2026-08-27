package com.myls.systemdesign.designpattern.structural.adapter;

public class LegacyGateway {

	public void executeTransaction(double money, String currency) {
	}

	public boolean checkStatus(long ref) {
		return true;
	}

	public int getReferenceNumber() {
		return 0;
	}
}

//but my application want  below methods
//
//processPayment()
//isPaymentSuccessful()
//getTransactionId()
