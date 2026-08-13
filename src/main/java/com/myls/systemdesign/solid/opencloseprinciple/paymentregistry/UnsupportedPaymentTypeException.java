package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

public class UnsupportedPaymentTypeException extends RuntimeException {

	public UnsupportedPaymentTypeException(PaymentTypeV1 type) {

		super("Unsupported payment type: " + type);
	}
}
