package com.myls.systemdesign.designpattern.behavioral.state.order;

public class CreatedState implements OrderStateNew {

	@Override
	public void startPayment(OrderNew order) {
		System.out.println("Starting payment...");

		order.setStatus(OrderStatusNew.PAYMENT_PENDING);
		order.setState(new PaymentPendingState());
	}

	@Override
	public void paymentSuccess(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void paymentFailed(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retryPayment(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pack(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ship(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void outForDelivery(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deliver(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancel(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestReturn(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void approveReturn(OrderNew order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void refund(OrderNew order) {
		// TODO Auto-generated method stub

	}

}
