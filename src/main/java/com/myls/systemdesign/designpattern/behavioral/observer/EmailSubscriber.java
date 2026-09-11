package com.myls.systemdesign.designpattern.behavioral.observer;

public class EmailSubscriber implements Subscriber {

	private final String email;

	EmailSubscriber(String email) {
		this.email = email;
	}

	@Override
	public void onNewVideo(String title) {
		System.out.println("Emailing " + email + ": new video \"" + title + "\" is up!");
	}

}
