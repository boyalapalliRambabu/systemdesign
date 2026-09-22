package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public class Director extends Approver {

	@Override
	void approve(PurchaseRequest req) {

		if (req.getAmount() <= 10000) {
			System.out.println("Director approved $" + req.getAmount());
		} else {
			escalate(req);
		}

	}

}
