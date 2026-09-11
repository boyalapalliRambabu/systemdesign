package com.myls.systemdesign.designpattern.behavioral.Strategy;

public class NoDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double subTotal) {
		return subTotal;
	}

}
