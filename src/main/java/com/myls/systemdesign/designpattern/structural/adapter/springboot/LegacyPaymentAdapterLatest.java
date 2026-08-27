package com.myls.systemdesign.designpattern.structural.adapter.springboot;

import org.springframework.stereotype.Component;

@Component
public class LegacyPaymentAdapterLatest implements PaymentProcessorLatest {

	private final LegacyPaymentGatewayLatest legacyPaymentGatewayLatest;

	public LegacyPaymentAdapterLatest(LegacyPaymentGatewayLatest legacyPaymentGatewayLatest) {
		this.legacyPaymentGatewayLatest = legacyPaymentGatewayLatest;
	}

	@Override
	public PaymentResponse processPayment(PaymentRequest req) {

		System.out.println("req.custmerId() " + req.customerId());
		LegacyPaymentResponse response = legacyPaymentGatewayLatest.executeTransaction(req.amount(), req.currency(),
				Long.parseLong(req.customerId()));

		return new PaymentResponse("SUCCESS".equals(response.getStatus()),
				String.valueOf(response.getTransactionReference()), response.getStatus());
	}

}
