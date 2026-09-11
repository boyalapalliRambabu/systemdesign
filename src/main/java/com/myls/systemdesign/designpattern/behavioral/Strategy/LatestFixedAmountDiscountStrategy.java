package com.myls.systemdesign.designpattern.behavioral.Strategy;

import org.springframework.stereotype.Component;

@Component("TAKE30")
public class LatestFixedAmountDiscountStrategy implements DiscountStrategy {

	@Override
	public double applyDiscount(double subtotal) {

		return Math.max(0, subtotal - 30);
	}

}
