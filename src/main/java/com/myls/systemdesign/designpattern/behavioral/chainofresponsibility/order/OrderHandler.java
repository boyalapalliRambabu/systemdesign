package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility.order;

public abstract class OrderHandler {

	protected OrderHandler next;

	public void setNext(OrderHandler next) {
		this.next = next;
	}

	public abstract void handle(OrderRequestChain request);

	protected void passToNext(OrderRequestChain request) {

		if (next != null) {
			next.handle(request);
		}

	}

}
