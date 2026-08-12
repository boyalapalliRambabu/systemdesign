package com.myls.systemdesign.solid.opencloseprinciple.ecommerce;

public class VipDiscount implements DiscountPolicy {

	@Override
	public CustomerType type() {
		return CustomerType.VIP;
	}

	@Override
	public double apply(double amount) {
		return amount * 0.70;
	}

}