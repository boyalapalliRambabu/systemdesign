package com.myls.systemdesign.designpattern.behavioral.Strategy;

public class CheckoutResponse {

	private double subtotal;
	private String promoCode;
	private double finalAmount;

	public CheckoutResponse(double subtotal, String promoCode, double finalAmount) {

		this.subtotal = subtotal;
		this.promoCode = promoCode;
		this.finalAmount = finalAmount;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public double getFinalAmount() {
		return finalAmount;
	}
}