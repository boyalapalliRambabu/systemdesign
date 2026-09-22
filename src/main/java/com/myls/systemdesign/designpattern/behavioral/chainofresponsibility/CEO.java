package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public class CEO extends Approver {
	@Override
	void approve(PurchaseRequest request) {
		System.out.println("CEO approved $" + request.getAmount()); // last resort -- no escalate()
	}
}