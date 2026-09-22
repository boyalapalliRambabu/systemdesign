package com.myls.systemdesign.designpattern.behavioral.templatemethod;

public abstract class OrderProcessor {

	public final void processOrder() {
		vildateOrder();
		processPayment();
		packOrder();
		shipOrder();
		sendNotification();
	}

	private void packOrder() {
		System.out.println("Validating order");
	}

	protected abstract void processPayment();

	private void vildateOrder() {
		System.out.println("Packing order");
	}

	private void shipOrder() {
		System.out.println("Shipping order");
	}

	private void sendNotification() {
		System.out.println("Sending notification");
	}

}
