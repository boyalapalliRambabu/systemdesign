package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceV1 {
	private final PaymentMethodRegistry registry;

	public PaymentServiceV1(PaymentMethodRegistry registry) {
		this.registry = registry;
	}

	public PaymentResponse process(PaymentRequest req) {

		PaymentMethodV1 method = registry.get(req.getType());

		return method.process(req);
	}
}
