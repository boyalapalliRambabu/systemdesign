package com.myls.systemdesign.designpattern.behavioral.observer.springboot;

public class OrderPlacedEvent {
	private final OrderLatest order;

	public OrderPlacedEvent(OrderLatest order) {
		this.order = order;
	}

	public OrderLatest getOrder() {
		return order;
	}
}
