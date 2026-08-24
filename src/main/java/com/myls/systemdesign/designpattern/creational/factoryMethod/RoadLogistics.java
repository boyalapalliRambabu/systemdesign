package com.myls.systemdesign.designpattern.creational.factoryMethod;

public class RoadLogistics extends Logistics {

	@Override
	public Transport createTransport() {
		return new Truck();
	}

}
