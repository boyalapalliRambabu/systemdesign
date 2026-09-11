package com.myls.systemdesign.designpattern.behavioral.observer;

public class EmailOrderObserver implements OrderObserver {

	@Override
	public void onOrderPlaced(Order order) {
		System.out.println("Sending email for order: " + order.getOrderId());
	}

}
