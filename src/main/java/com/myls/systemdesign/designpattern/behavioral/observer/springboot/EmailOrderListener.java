package com.myls.systemdesign.designpattern.behavioral.observer.springboot;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailOrderListener {

	@EventListener
	public void handleOrderPlaced(OrderPlacedEvent event) {

		System.out.println("Sending email for order: " + event.getOrder().getOrderId());
	}
}