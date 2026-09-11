package com.myls.systemdesign.designpattern.behavioral.Strategy;

public class PercentageDiscount implements DiscountStrategy {

	private final double percentOff;

	public PercentageDiscount(double percentOff) {
		this.percentOff = percentOff;
	}

	@Override
	public double applyDiscount(double subTotal) {
		return subTotal * (1 - percentOff);
	}

}
