package com.myls.systemdesign.designpattern.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class NotificationServicelatest {
	public void sendOrderConfirmation(String customerId, String orderId) {

		System.out.println("Sending order confirmation to " + customerId);
	}

	public void sendCancellation(String customerId, String orderId) {

		System.out.println("Sending cancellation notification");
	}
}
