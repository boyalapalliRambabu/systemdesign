package com.myls.systemdesign.solid.opencloseprinciple.payment;

public interface PaymentMethod {
	PaymentType type();

	public PaymentResponse process(PaymentRequest req);

}
