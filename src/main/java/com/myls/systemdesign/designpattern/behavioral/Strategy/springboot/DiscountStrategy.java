package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.math.BigDecimal;

public interface DiscountStrategy {

	BigDecimal calculateDiscount(BigDecimal subtotal, BigDecimal discountValue, BigDecimal maximumDiscount);
}