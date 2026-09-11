package com.myls.systemdesign.designpattern.behavioral.observer;

public class LoyaltyOrderObserver implements OrderObserver {

	@Override
	public void onOrderPlaced(Order order) {
		System.out.println("Adding loyalty points for order: " + order.getOrderId());
	}

}
