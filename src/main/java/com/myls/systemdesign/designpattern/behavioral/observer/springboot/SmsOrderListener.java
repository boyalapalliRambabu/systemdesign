package com.myls.systemdesign.designpattern.behavioral.observer.springboot;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SmsOrderListener {

	@EventListener
	public void handleOrderPlaced(OrderPlacedEvent event) {

		System.out.println("Sending SMS for order: " + event.getOrder().getOrderId());
	}
}
