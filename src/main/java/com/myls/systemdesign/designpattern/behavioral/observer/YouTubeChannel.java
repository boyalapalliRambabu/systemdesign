package com.myls.systemdesign.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements ChannelSubject {

	private final List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);

	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers(String title) {
		for (Subscriber s : new ArrayList<>(subscribers)) {
			s.onNewVideo(title);
		}
	}

	void uploadVideo(String title) {
		System.out.println("Channel: new video published --" + title);
		notifySubscribers(title);
	}

}
