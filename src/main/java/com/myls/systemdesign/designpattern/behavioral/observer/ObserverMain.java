package com.myls.systemdesign.designpattern.behavioral.observer;

public class ObserverMain {

	public static void main(String[] args) {

		YouTubeChannel channel = new YouTubeChannel();

		Subscriber viewer1 = new EmailSubscriber("viewer1@example.com");
		Subscriber viewer2 = new EmailSubscriber("viewer2@example.com");
		channel.subscribe(viewer1);
		channel.subscribe(viewer2);
		channel.uploadVideo("Design Patterns Explained");
		channel.unsubscribe(viewer1); // viewer1 opts out
		channel.uploadVideo("Part 2: Behavioral Patterns");

	}
}
