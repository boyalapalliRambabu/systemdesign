package com.myls.systemdesign.solid.opencloseprinciple.payment;

import org.springframework.stereotype.Service;

@Service
public class NetBankingPayment implements PaymentMethod {

	@Override
	public PaymentType type() {
		return PaymentType.NETBANKING;
	}

	@Override
	public PaymentResponse process(PaymentRequest req) {
		System.out.println("Processing net banking payment of " + req.getAmount());
		return new PaymentResponse(true, "Net banking payment successfull");
	}

}
