package com.myls.systemdesign.solid.opencloseprinciple.ecommerce;

public class DiscountService {
	public double applyDiscount(DiscountPolicy policy, double amount) {
		return policy.apply(amount);
	}

}
