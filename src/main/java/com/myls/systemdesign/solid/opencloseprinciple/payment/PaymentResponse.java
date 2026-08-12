package com.myls.systemdesign.solid.opencloseprinciple.payment;

public class PaymentResponse {

	private final boolean success;
	private final String message;

	public PaymentResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "PaymentResponse [success=" + success + ", message=" + message + "]";
	}

}
