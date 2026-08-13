package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentsV1")
public class PaymentControllerV1 {

	private final PaymentServiceV1 paymentService;

	public PaymentControllerV1(PaymentServiceV1 paymentService) {

		this.paymentService = paymentService;
	}

	@PostMapping
	public PaymentResponse processPayment(@RequestBody PaymentRequest request) {

		return paymentService.process(request);
	}
}