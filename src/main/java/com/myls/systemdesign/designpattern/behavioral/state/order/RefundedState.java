package com.myls.systemdesign.designpattern.behavioral.state.order;

public class RefundedState implements OrderStateNew {

	@Override
	public void startPayment(OrderNew order) {
		System.out.println("Refunded order cannot start payment");
	}

	@Override
	public void paymentSuccess(OrderNew order) {
		System.out.println("Refunded order cannot be paid");
	}

	@Override
	public void paymentFailed(OrderNew order) {
		System.out.println("Refunded order cannot have payment");
	}

	@Override
	public void retryPayment(OrderNew order) {
		System.out.println("Refunded order cannot retry payment");
	}

	@Override
	public void pack(OrderNew order) {
		System.out.println("Refunded order cannot be packed");
	}

	@Override
	public void ship(OrderNew order) {
		System.out.println("Refunded order cannot be shipped");
	}

	@Override
	public void outForDelivery(OrderNew order) {
		System.out.println("Refunded order cannot be delivered");
	}

	@Override
	public void deliver(OrderNew order) {
		System.out.println("Refunded order cannot be delivered");
	}

	@Override
	public void cancel(OrderNew order) {
		System.out.println("Refunded order cannot be cancelled");
	}

	@Override
	public void requestReturn(OrderNew order) {
		System.out.println("Order has already been returned");
	}

	@Override
	public void approveReturn(OrderNew order) {
		System.out.println("Order has already been returned");
	}

	@Override
	public void refund(OrderNew order) {
		System.out.println("Order is already refunded");
	}
}