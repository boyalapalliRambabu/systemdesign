package com.myls.systemdesign.designpattern.behavioral.templatemethod.spring;

public class UpiTransactionProcessor extends TransactionProcessor {

	@Override
	protected void processTransaction(TransactionRequest request) {
		System.out.println("Processing UPI transaction");
	}

}
