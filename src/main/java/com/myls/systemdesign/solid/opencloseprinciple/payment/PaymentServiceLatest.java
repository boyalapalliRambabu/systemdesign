package com.myls.systemdesign.solid.opencloseprinciple.payment;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

//public class PaymentServiceLatest {
//
//	public PaymentResponse process(PaymentMethod paymentMethod, PaymentRequest req) {
//		return paymentMethod.process(req);
//	}
//}
@Service
public class PaymentServiceLatest {

	private final List<PaymentMethod> paymentMethods;

	public PaymentResponse process(PaymentMethod paymentMethod, PaymentRequest req) {
		return paymentMethod.process(req);
	}

	public PaymentServiceLatest(List<PaymentMethod> paymentMethod) {
		this.paymentMethods = paymentMethod;
	}

	public PaymentResponse processnew(PaymentType type, PaymentRequest req) {

		PaymentMethod paymentMethod = paymentMethods.stream().filter(method -> method.type() == type).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Unsupported payment type" + type));

		System.out.println("paymentMethod " + paymentMethod.getClass().getName());

		return paymentMethod.process(req);
	}
}