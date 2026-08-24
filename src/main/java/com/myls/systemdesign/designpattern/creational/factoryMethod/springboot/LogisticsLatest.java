package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

public abstract class LogisticsLatest {

	public abstract String type();

	public abstract TransportLatest createTransport();

	public void planDeliver() {
		TransportLatest trans = createTransport();
		trans.deliver();
	}
}
