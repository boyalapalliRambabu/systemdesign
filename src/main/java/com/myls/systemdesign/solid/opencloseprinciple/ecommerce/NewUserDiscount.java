package com.myls.systemdesign.solid.opencloseprinciple.ecommerce;

public class NewUserDiscount implements DiscountPolicy {

	@Override
	public CustomerType type() {
		return CustomerType.NEW;
	}

	@Override
	public double apply(double amount) {

		return amount * 0.90;
	}

}
