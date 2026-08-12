package com.myls.systemdesign.solid.opencloseprinciple.ecommerce;

public class PrimeDiscount implements DiscountPolicy {

	@Override
	public CustomerType type() {
		return CustomerType.PRIME;
	}

	@Override
	public double apply(double amount) {

		return amount * 0.80;
	}

}
