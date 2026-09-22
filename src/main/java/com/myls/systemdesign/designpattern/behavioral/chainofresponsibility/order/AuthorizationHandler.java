package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public class AuthorizationHandler extends OrderHandler {

	@Override
	public void handle(OrderRequestChain request) {

		if (!"CUSTOMER".equals(request.userRole)) {
			System.out.println("Authorization failed");
			return;
		}
		System.out.println("Authorization successful");

		passToNext(request);
	}

}
