package com.myls.systemdesign.designpattern.behavioral.Strategy;

public class StrategyCheckoutRequest {

	private double subtotal;
	private String promoCode;

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
}
