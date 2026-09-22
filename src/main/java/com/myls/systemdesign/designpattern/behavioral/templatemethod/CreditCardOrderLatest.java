package com.myls.systemdesign.designpattern.behavioral.templatemethod;

public class CreditCardOrderLatest extends OrderProcessor {

	@Override
	protected void processPayment() {
		System.out.println("Processing Credit Card payment");
	}

}
