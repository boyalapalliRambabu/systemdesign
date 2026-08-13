package com.myls.systemdesign.solid.opencloseprinciple.paymentregistry;

import java.math.BigDecimal;

public class PaymentRequest {

	private PaymentTypeV1 type;
	private String transactionId;
	private BigDecimal amount;

	public PaymentRequest() {
	}

	public PaymentTypeV1 getType() {
		return type;
	}

	public void setType(PaymentTypeV1 type) {
		this.type = type;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}