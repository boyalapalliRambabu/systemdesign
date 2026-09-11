package com.myls.systemdesign.designpattern.structural.facade;

public class OrderResponse {

	private boolean success;
	private String orderId;
	private String message;

	public OrderResponse(boolean success, String orderId, String message) {

		this.success = success;
		this.orderId = orderId;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getMessage() {
		return message;
	}
}