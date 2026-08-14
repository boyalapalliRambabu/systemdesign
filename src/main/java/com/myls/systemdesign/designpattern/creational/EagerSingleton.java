package com.myls.systemdesign.designpattern.creational;

public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstace() {
		return instance;
	}
}
