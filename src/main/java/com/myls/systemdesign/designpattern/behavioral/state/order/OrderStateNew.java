package com.myls.systemdesign.designpattern.behavioral.state.order;

public interface OrderStateNew {
	void startPayment(OrderNew order);

	void paymentSuccess(OrderNew order);

	void paymentFailed(OrderNew order);

	void retryPayment(OrderNew order);

	void pack(OrderNew order);

	void ship(OrderNew order);

	void outForDelivery(OrderNew order);

	void deliver(OrderNew order);

	void cancel(OrderNew order);

	void requestReturn(OrderNew order);

	void approveReturn(OrderNew order);

	void refund(OrderNew order);

}
