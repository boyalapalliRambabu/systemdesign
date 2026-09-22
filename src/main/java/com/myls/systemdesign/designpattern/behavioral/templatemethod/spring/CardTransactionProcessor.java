package com.myls.systemdesign.designpattern.behavioral.templatemethod.spring;

public class CardTransactionProcessor extends TransactionProcessor {
	@Override
	protected void processTransaction(TransactionRequest request) {
		System.out.println("Processing Card transaction");
	}
}