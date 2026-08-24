package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import org.springframework.stereotype.Component;

@Component
public class ShipLatest implements TransportLatest {

	@Override
	public void deliver() {
		System.out.println("Delivering by sea in a container ship");
	}

}
