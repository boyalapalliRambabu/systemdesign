package com.myls.systemdesign.designpattern.structural.adapter.springboot;

public class LegacyPaymentResponse {

	private final long transactionReference;
	private final String status;

	public LegacyPaymentResponse(long transactionReference, String status) {
		this.transactionReference = transactionReference;
		this.status = status;
	}

	public long getTransactionReference() {
		return transactionReference;
	}

	public String getStatus() {
		return status;
	}
}
