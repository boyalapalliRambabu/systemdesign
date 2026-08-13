package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import org.springframework.stereotype.Service;

@Service
public class UpiPaymentV1 implements PaymentMethodV1 {

	@Override
	public PaymentTypeV1 type() {

		return PaymentTypeV1.UPI;
	}

	@Override
	public PaymentResponse process(PaymentRequest request) {

		System.out.println("Processing UPI payment: " + request.getAmount());

		return new PaymentResponse(true, "UPI payment successful");
	}

}
