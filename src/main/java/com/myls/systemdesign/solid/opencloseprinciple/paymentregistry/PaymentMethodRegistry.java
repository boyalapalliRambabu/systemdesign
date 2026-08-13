package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class PaymentMethodRegistry {

	private final Map<PaymentTypeV1, PaymentMethodV1> methods;

	public PaymentMethodRegistry(List<PaymentMethodV1> imps) {
		this.methods = imps.stream().collect(Collectors.toUnmodifiableMap(PaymentMethodV1::type, Function.identity()));
	}

	public PaymentMethodV1 get(PaymentTypeV1 type) {

		PaymentMethodV1 method = methods.get(type);
		if (method == null) {
			throw new UnsupportedPaymentTypeException(type);
		}
		return method;
	}
}
