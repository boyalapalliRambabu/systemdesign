package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public class VP extends Approver {

	@Override
	void approve(PurchaseRequest req) {

		if (req.getAmount() <= 50000) {
			System.out.println("VP approved $" + req.getAmount());

		} else {
			escalate(req);
		}
	}

}
