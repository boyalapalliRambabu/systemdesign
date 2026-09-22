package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public class OrderChainMain {

	public static void main(String[] args) {
		AuthenticationHandler authentication = new AuthenticationHandler();

		AuthorizationHandler authorization = new AuthorizationHandler();

		ValidationHandler validation = new ValidationHandler();

		OrderProcessingHandler processing = new OrderProcessingHandler();

		authentication.setNext(authorization);
		authorization.setNext(validation);
		validation.setNext(processing);
		OrderRequestChain request = new OrderRequestChain("JWT-123", "CUSTOMER", 2500);

		authentication.handle(request);
	}

}
