package com.myls.systemdesign.designpattern.behavioral.observer;

public class OrderService {

	private final OrderSubject orderSubject;

	public OrderService(OrderSubject orderSubject) {
		this.orderSubject = orderSubject;
	}

	public void placeOrder(Order order) {

		System.out.println("Order placed: " + order.getOrderId());

		orderSubject.notifyObservers(order);
	}

}
