package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentV1 implements PaymentMethodV1 {

	@Override
	public PaymentTypeV1 type() {
		return PaymentTypeV1.CARD;
	}

	@Override
	public PaymentResponse process(PaymentRequest request) {
		System.out.println("Processing CARD payment: " + request.getAmount());

		return new PaymentResponse(true, "Card payment successful");
	}

}
