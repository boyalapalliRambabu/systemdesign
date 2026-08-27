package com.myls.systemdesign.designpattern.structural.decorator;

public class EmailNotificationSender implements NotificationSender {

	@Override
	public void send(String recipient, String message) {

		System.out.println("Sending email to " + recipient);

	}

}
