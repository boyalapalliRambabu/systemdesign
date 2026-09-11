package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CheckoutNewRequest {

	@NotNull
	@DecimalMin(value = "0.01")
	private BigDecimal subtotal;

	@NotBlank
	private String promoCode;

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

}
