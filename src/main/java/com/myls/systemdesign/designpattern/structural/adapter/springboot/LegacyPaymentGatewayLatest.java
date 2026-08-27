package com.myls.systemdesign.designpattern.structural.adapter.springboot;

public class LegacyPaymentGatewayLatest {

	public LegacyPaymentResponse executeTransaction(double amount, String currency, long customerNumber) {

		System.out.println("Callig legacy payment gateway");

		return new LegacyPaymentResponse(12345678L, "SUCCESS");
	}
}
