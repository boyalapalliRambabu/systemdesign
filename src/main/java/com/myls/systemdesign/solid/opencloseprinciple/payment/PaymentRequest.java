package com.myls.systemdesign.solid.opencloseprinciple.payment;

import java.math.BigDecimal;

public class PaymentRequest {

	private final String transactionId;
	private final BigDecimal amount;

	public PaymentRequest(String transactionId, BigDecimal amount) {
		this.transactionId = transactionId;
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}
}