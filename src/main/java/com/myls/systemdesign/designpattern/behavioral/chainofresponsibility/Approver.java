package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public abstract class Approver {

	protected Approver next;

	void setNext(Approver next) {
		this.next = next;
	}

	abstract void approve(PurchaseRequest req);

	protected void escalate(PurchaseRequest req) {

		if (next != null) {
			next.approve(req);
		} else {
			System.out.println("No approver left in the chain -- request rejected.");
		}
	}
}
