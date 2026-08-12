package com.myls.systemdesign.solid.opencloseprinciple.payment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	private final PaymentServiceLatest paymentServiceLatest;

	public PaymentController(PaymentServiceLatest paymentServiceLatest) {
		this.paymentServiceLatest = paymentServiceLatest;
	}

	@PostMapping
	public PaymentResponse postMethodName(@RequestParam PaymentType type, @RequestBody PaymentRequest request) {
		return paymentServiceLatest.processnew(type, request);

	}

}
