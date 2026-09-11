package com.myls.systemdesign.designpattern.behavioral.observer.springboot;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderLatestService {
	private final ApplicationEventPublisher eventPublisher;

	public OrderLatestService(ApplicationEventPublisher eventPublisher) {

		this.eventPublisher = eventPublisher;
	}

	public void placeOrder(OrderLatest order) {

		System.out.println("Order placed: " + order.getOrderId());

		eventPublisher.publishEvent(new OrderPlacedEvent(order));
	}

}
