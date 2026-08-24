package com.myls.systemdesign.designpattern.creational.singleton;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton instace;

	static {
		instace = new StaticBlockSingleton();
	}

	private StaticBlockSingleton() {

	}

	public static StaticBlockSingleton getInstance() {
		return instace;
	}

}
