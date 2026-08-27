package com.myls.systemdesign.designpattern.structural.adapter.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/adapter")
public class PaymentAdapterController {
	private CheckoutServiceLatest checkoutService;

	public PaymentAdapterController(CheckoutServiceLatest checkoutService) {
		this.checkoutService = checkoutService;

	}

	@PostMapping("payments")
	public PaymentResponse postMethodName(@RequestBody PaymentRequest request) {
		System.out.println("request " + request);
		return checkoutService.chechOut(request);
	}

}
