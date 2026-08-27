package com.myls.systemdesign.designpattern.structural.decorator;

public abstract class NotificationDecorator implements NotificationSender {

	protected final NotificationSender inner;

	public NotificationDecorator(NotificationSender inner) {
		this.inner = inner;
	}
}
