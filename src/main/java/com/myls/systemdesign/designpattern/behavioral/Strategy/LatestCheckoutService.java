package com.myls.systemdesign.designpattern.behavioral.Strategy;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class LatestCheckoutService {

	private final Map<String, DiscountStrategy> strategies;

	public LatestCheckoutService(Map<String, DiscountStrategy> strategies) {
		this.strategies = strategies;
	}

	public double checkout(double subTotal, String promoCode) {

		DiscountStrategy strategy = strategies.getOrDefault(promoCode, strategies.get("NO_DISCOUNT"));

		return strategy.applyDiscount(subTotal);

	}

}
