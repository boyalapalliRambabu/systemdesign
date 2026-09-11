package com.myls.systemdesign.designpattern.behavioral.Strategy;

import org.springframework.stereotype.Component;

@Component("NO_DISCOUNT")
public class LatestNoDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double subTotal) {
		return subTotal;
	}

}
