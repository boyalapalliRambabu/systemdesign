package com.myls.systemdesign.designpattern.creational.factoryMethod;

public abstract class Logistics {

	public abstract Transport createTransport();

	public void planDeliver() {
		Transport tns = createTransport();
		tns.deliver();
	}

}
