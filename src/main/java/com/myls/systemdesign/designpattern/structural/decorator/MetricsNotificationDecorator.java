package com.myls.systemdesign.designpattern.structural.decorator;

public class MetricsNotificationDecorator extends NotificationDecorator {

	public MetricsNotificationDecorator(NotificationSender inner) {
		super(inner);
	}

	@Override
	public void send(String recipient, String message) {

		long start = System.currentTimeMillis();

		inner.send(recipient, message);

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms");

	}

}
