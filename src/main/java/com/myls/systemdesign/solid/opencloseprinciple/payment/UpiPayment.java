package com.myls.systemdesign.solid.opencloseprinciple.payment;

import org.springframework.stereotype.Service;

@Service
public class UpiPayment implements PaymentMethod {

	@Override
	public PaymentType type() {
		return PaymentType.UPI;
	}

	@Override
	public PaymentResponse process(PaymentRequest req) {
		System.out.println("Processed upi payment of " + req.getAmount());
		return new PaymentResponse(true, "Upi payment successfull");
	}

}
