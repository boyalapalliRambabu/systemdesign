package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public class ValidationHandler extends OrderHandler {

	@Override
	public void handle(OrderRequestChain request) {

		if (request.amount <= 0) {
			System.out.println("Invalid order amount");
			return;
		}
		System.out.println("Order validation successful");

		passToNext(request);
	}

}
