package com.myls.systemdesign.designpattern.creational;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

	public static synchronized getInstance() {

		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}
