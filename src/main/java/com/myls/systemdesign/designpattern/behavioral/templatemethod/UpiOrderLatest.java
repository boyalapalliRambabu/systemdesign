package com.myls.systemdesign.designpattern.behavioral.templatemethod;

public class UpiOrderLatest extends OrderProcessor {

	@Override
	protected void processPayment() {
		System.out.println("Processing UPI payment");
	}
}