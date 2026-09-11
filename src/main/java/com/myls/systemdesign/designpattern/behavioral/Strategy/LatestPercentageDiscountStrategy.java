package com.myls.systemdesign.designpattern.behavioral.Strategy;

import org.springframework.stereotype.Component;

@Component("SAVE15")	
public class LatestPercentageDiscountStrategy implements DiscountStrategy {

	@Override
	public double applyDiscount(double subtotal) {

		return subtotal * 0.85;
	}

}
