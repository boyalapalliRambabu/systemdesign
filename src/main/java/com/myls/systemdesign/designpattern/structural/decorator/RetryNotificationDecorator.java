package com.myls.systemdesign.designpattern.structural.decorator;

public class RetryNotificationDecorator extends NotificationDecorator {

	public RetryNotificationDecorator(NotificationSender inner) {
		super(inner);

	}

	@Override
	public void send(String recipient, String message) {

		int maxAttempts = 3;

		for (int attempts = 1; attempts <= maxAttempts; attempts++) {

			try {
				inner.send(recipient, message);
				return;
			} catch (Exception e) {

				if (attempts == maxAttempts) {
					throw e;
				}
				System.out.println("Retry attempt: " + attempts);
			}
		}
	}

}
