package com.myls.systemdesign.designpattern.behavioral.observer.springboot;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordersObserver")
public class ObserverOrderController {
	private final OrderLatestService orderService;

	public ObserverOrderController(OrderLatestService orderService) {
		this.orderService = orderService;
	}

	@PostMapping
	public String placeOrder() {

		OrderLatest order = new OrderLatest("ORD101", "user@gmail.com", new BigDecimal("2500"));

		orderService.placeOrder(order);

		return "Order placed successfully";
	}
}
