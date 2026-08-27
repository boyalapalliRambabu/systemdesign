package com.myls.systemdesign.designpattern.structural.decorator;

public class LoggingNotificationDecorator extends NotificationDecorator {

	public LoggingNotificationDecorator(NotificationSender inner) {
		super(inner);
	}

	@Override
	public void send(String recipient, String message) {
		System.out.println("Log :Sending notification to " + recipient);
		inner.send(recipient, message);
	}

}
