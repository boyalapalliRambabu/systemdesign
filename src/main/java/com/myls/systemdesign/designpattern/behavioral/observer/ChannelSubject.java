package com.myls.systemdesign.designpattern.behavioral.observer;

public interface ChannelSubject {

	void subscribe(Subscriber subscriber);

	void unsubscribe(Subscriber subscriber);

	void notifySubscribers(String title);

}
