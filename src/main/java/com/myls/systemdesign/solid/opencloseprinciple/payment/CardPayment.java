package com.myls.systemdesign.solid.opencloseprinciple.payment;

import org.springframework.stereotype.Service;

@Service
public class CardPayment implements PaymentMethod {

	@Override
	public PaymentType type() {
		return PaymentType.CARD;
	}

	@Override
	public PaymentResponse process(PaymentRequest req) {
		System.out.println("Processed card payment of " + req.getAmount());
		return new PaymentResponse(true, "Card payment successfull");
	}

}
