package com.myls.systemdesign.designpattern.structural.facade;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderControllerLatest {

	private final OrderFacade orderFacade;

	public OrderControllerLatest(OrderFacade orderFacade) {

		this.orderFacade = orderFacade;
	}

	@PostMapping
	public OrderResponse placeOrder(@RequestBody OrderRequest request) {

		return orderFacade.placeOrder(request);
	}
}