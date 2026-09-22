package com.myls.systemdesign.designpattern.behavioral.state.order;

public class OrderNew {

	private final Long orderId;

	// Business/persistent status
	private OrderStatusNew status;

	private OrderStateNew state;

	public OrderNew(Long orderId) {
		this.orderId = orderId;
		this.status = OrderStatusNew.CREATED;
		this.state = new CreatedState();
	}

	public void startPayment() {
		state.startPayment(this);
	}

	public void paymentSuccess() {
		state.paymentSuccess(this);
	}

	public void paymentFailed() {
		state.paymentFailed(this);
	}

	public void retryPayment() {
		state.retryPayment(this);
	}

	public void pack() {
		state.pack(this);
	}

	public void ship() {
		state.ship(this);
	}

	public void outForDelivery() {
		state.outForDelivery(this);
	}

	public void deliver() {
		state.deliver(this);
	}

	public void cancel() {
		state.cancel(this);
	}

	public void requestReturn() {
		state.requestReturn(this);
	}

	public void approveReturn() {
		state.approveReturn(this);
	}

	public void refund() {
		state.refund(this);
	}

	// ----------------------------------------
	// State transition
	// ----------------------------------------

	public void setState(OrderStateNew state) {
		this.state = state;
	}

	public void setStatus(OrderStatusNew status) {
		this.status = status;
	}

	public Long getOrderId() {
		return orderId;
	}

	public OrderStatusNew getStatus() {
		return status;
	}

}
