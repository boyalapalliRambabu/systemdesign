package com.myls.systemdesign.solid.dependencyinversionprinciple;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	private final OrderServiceLatest orderService;

	public OrderController(OrderServiceLatest orderService) {
		this.orderService = orderService;
	}

	@PostMapping
	public String createOrder(@RequestBody Order order) {

		orderService.createOrder(order);

		return "Order created successfully";
	}
}