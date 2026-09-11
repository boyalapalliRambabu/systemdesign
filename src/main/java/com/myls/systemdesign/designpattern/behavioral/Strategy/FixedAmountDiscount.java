package com.myls.systemdesign.designpattern.behavioral.Strategy;

public class FixedAmountDiscount implements DiscountStrategy {

	private final double amountOff;

	public FixedAmountDiscount(double amountOff) {
		this.amountOff = amountOff;
	}

	@Override
	public double applyDiscount(double subTotal) {

		return Math.max(0, subTotal - amountOff);
	}

}
