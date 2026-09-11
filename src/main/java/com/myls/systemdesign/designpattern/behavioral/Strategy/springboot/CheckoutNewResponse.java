package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.math.BigDecimal;

public class CheckoutNewResponse {

	private String promoCode;

	private BigDecimal subtotal;

	private BigDecimal discount;

	private BigDecimal finalAmount;

	public CheckoutNewResponse(String promoCode, BigDecimal subtotal, BigDecimal discount, BigDecimal finalAmount) {

		this.promoCode = promoCode;
		this.subtotal = subtotal;
		this.discount = discount;
		this.finalAmount = finalAmount;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

}
