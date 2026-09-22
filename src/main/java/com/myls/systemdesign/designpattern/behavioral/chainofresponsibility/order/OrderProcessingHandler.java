package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public class OrderProcessingHandler extends OrderHandler {
	@Override
	public void handle(OrderRequestChain request) {
		System.out.println("Order processed successfully: ₹" + request.amount);
	}
}
