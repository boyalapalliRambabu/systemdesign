package com.myls.systemdesign.designpattern.behavioral.Strategy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class StrategyCheckoutController {

	private final LatestCheckoutService checkOutService;

	public StrategyCheckoutController(LatestCheckoutService checkOutService) {
		this.checkOutService = checkOutService;
	}

	@PostMapping
	public CheckoutResponse checkOut(@RequestBody StrategyCheckoutRequest request) {
		double finalAmount = checkOutService.checkout(request.getSubtotal(), request.getPromoCode());
		return new CheckoutResponse(request.getSubtotal(), request.getPromoCode(), finalAmount);
	}

}
