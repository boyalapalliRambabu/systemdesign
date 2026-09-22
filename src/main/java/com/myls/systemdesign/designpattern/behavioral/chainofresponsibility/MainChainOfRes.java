package com.myls.systemdesign.designpattern.behavioral.chainofresponsibility;

public class MainChainOfRes {

	public static void main(String[] args) {
		Approver manager = new Manager();
		Approver directort = new Director();
		Approver vp = new VP();
		Approver ceo = new CEO();
		manager.setNext(directort);
		directort.setNext(vp);
		vp.setNext(ceo);
		manager.approve(new PurchaseRequest(750));
		manager.approve(new PurchaseRequest(75000));

	}
}
