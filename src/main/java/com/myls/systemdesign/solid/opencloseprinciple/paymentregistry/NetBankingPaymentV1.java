package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import org.springframework.stereotype.Service;

@Service
public class NetBankingPaymentV1 implements PaymentMethodV1 {

	@Override
	public PaymentTypeV1 type() {

		return PaymentTypeV1.NETBANKING;
	}

	@Override
	public PaymentResponse process(PaymentRequest request) {
		System.out.println("Processing NET BANKING payment: " + request.getAmount());

		return new PaymentResponse(true, "Net banking payment successful");
	}

}
