package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public class Manager extends Approver {

	@Override
	void approve(PurchaseRequest req) {
		if (req.getAmount() <= 1000) {
			System.out.println("Manager approved $" + req.getAmount());
		} else {
			escalate(req); // can't decide -- pass it up, don't reject it
		}
	}

}
