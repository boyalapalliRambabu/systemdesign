package com.myls.systemdesign.designpattern.structural.adapter.springboot;

public interface PaymentProcessorLatest {
	PaymentResponse processPayment(PaymentRequest req);
}
