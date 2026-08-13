package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

public interface PaymentMethodV1 {

	PaymentTypeV1 type();

	PaymentResponse process(PaymentRequest request);

}
