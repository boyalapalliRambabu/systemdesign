package com.myls.systemdesign.designpattern.behavioral.templatemethod.spring;

public abstract class TransactionProcessor {

	public final void process(TransactionRequest request) {
		validate(request);

		checkFraud(request);

		processTransaction(request);

		saveTransaction(request);

		sendNotification(request);

	}

	private void validate(TransactionRequest request) {
		System.out.println("Validating transaction...");
	}

	private void checkFraud(TransactionRequest request) {
		System.out.println("Checking fraud...");
	}

	protected abstract void processTransaction(TransactionRequest request);

	private void saveTransaction(TransactionRequest request) {
		System.out.println("Saving transaction...");
	}

	protected void sendNotification(TransactionRequest request) {
		System.out.println("Sending notification...");
	}

}
