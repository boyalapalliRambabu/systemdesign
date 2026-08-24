package com.myls.systemdesign.designpattern.creational.factoryMethod;

public class SeaLogistics extends Logistics {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
