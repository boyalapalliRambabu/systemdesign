package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("FIXED")
public class FixedDiscountStrategy implements DiscountStrategy {

	@Override
	public BigDecimal calculateDiscount(BigDecimal subtotal, BigDecimal discountValue, BigDecimal maximumDiscount) {

		BigDecimal discount = discountValue;

		if (discount.compareTo(subtotal) > 0) {
			discount = subtotal;
		}

		if (maximumDiscount != null && discount.compareTo(maximumDiscount) > 0) {

			discount = maximumDiscount;
		}

		return discount;
	}
}
