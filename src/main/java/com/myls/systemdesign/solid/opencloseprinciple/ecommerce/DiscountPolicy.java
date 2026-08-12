package com.myls.systemdesign.solid.opencloseprinciple.ecommerce;

public interface DiscountPolicy {
	CustomerType type();

	double apply(double amount);
}
