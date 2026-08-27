package com.myls.systemdesign.designpattern.structural.decorator;

public class NotificationRequest {
	private String recipient;
	private String message;

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NotificationRequest [recipient=" + recipient + ", message=" + message + "]";
	}

}
