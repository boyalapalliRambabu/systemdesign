package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public class AuthenticationHandler extends OrderHandler {

	@Override
	public void handle(OrderRequestChain request) {

		if (request.token == null || request.token.isBlank()) {
			System.out.println("Authentication failed");
			return;
		}
		System.out.println("Authentication successful");
		passToNext(request);
	}

}
