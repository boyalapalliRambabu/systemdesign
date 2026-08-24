package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

	private final LogisticsFactory factory;

	public DeliveryService(LogisticsFactory factory) {
		this.factory = factory;
	}

	public void deliver(String type) {

		LogisticsLatest ls = factory.getLogistic(type);

		ls.planDeliver();

	}

}
