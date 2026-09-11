package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("PERCENTAGE")
public class PercentageDiscountStrategy implements DiscountStrategy {

	@Override
	public BigDecimal calculateDiscount(BigDecimal subtotal, BigDecimal discountValue, BigDecimal maximumDiscount) {
		BigDecimal discount = subtotal.multiply(discountValue).divide(BigDecimal.valueOf(100));

		if (maximumDiscount != null && discount.compareTo(maximumDiscount) > 0) {
			return maximumDiscount;
		}
		return discount;
	}

}
