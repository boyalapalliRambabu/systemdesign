package com.myls.systemdesign.designpattern.behavioral.templatemethod;

public class TempateMethodMain {

	public static void main(String[] args) {

		OrderProcessor creditCard = new CreditCardOrderLatest();
		creditCard.processOrder();

		OrderProcessor upiCard = new UpiOrderLatest();
		upiCard.processOrder();

	}

}
