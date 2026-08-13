package com.myls.systemdesign.solid.dependencyinversionprinciple;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceLatest {

	private final OrderRepository repository;

	public OrderServiceLatest(OrderRepository repository) {
		this.repository = repository;
	}

	public void createOrder(Order order) {

		// Business logic

		if (order.getAmount() <= 0) {
			throw new IllegalArgumentException("Order amount must be greater than zero");
		}

		repository.save(order);
	}
}
