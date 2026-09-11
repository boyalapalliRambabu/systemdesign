package com.myls.systemdesign.designpattern.behavioral.observer;

public class SmsOrderObserver implements OrderObserver {

	@Override
	public void onOrderPlaced(Order order) {
		System.out.println("Sending SMS for order: " + order.getOrderId());
	}
}
