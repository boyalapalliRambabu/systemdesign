package com.myls.systemdesign.designpattern.behavioral.observer;

public class OrderMain {

	public static void main(String[] args) {

		OrderSubject orderSubject = new OrderSubject();

		OrderObserver emailObserver = new EmailOrderObserver();

		OrderObserver smsObserver = new SmsOrderObserver();

		OrderObserver loyaltyObserver = new LoyaltyOrderObserver();

		orderSubject.subscribe(emailObserver);
		orderSubject.subscribe(smsObserver);
		orderSubject.subscribe(loyaltyObserver);

		OrderService orderService = new OrderService(orderSubject);

		Order order = new Order("ORD101", "user@gmail.com", 2500);

		orderService.placeOrder(order);
	}
}
