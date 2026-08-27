package com.myls.systemdesign.designpattern.structural.adapter;

public class LegacyGatewayAdapter implements PaymentProcessor {

	private LegacyGateway legacyGateway;

	public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
		this.legacyGateway = legacyGateway;
	}

	@Override
	public void processPayment(double amount, String currency) {

		legacyGateway.executeTransaction(amount, currency);

	}

	@Override
	public boolean isPaymentSuccessful() {
		return legacyGateway.checkStatus(legacyGateway.getReferenceNumber());
	}

	@Override
	public int getTransactionId() {
		return legacyGateway.getReferenceNumber();
	}

}
