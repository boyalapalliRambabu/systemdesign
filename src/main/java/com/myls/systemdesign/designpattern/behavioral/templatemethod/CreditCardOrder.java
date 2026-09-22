package com.myls.systemdesign.designpattern.behavioral.templatemethod;

public class CreditCardOrder {
	public void processOrder() {
		validateOrder();
		System.out.println("Processing the credit card payment");
		packOrder();
		shipOrder();
		sendNotification();

	}

	private void packOrder() {
		System.out.println("Packing order");
	}

	private void sendNotification() {
		System.out.println("Sending notification");
	}

	private void shipOrder() {
		System.out.println("Shipping order");
	}

	private void validateOrder() {
		System.out.println("Validating order");

	}

}
