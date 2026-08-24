package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import org.springframework.stereotype.Component;

@Component
public class TruckLatest implements TransportLatest {
	@Override
	public void deliver() {
		System.out.println("Delivering by land in a box truck.");
	}

}
