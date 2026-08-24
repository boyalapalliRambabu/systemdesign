package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import org.springframework.stereotype.Component;

@Component
public class SeaLogisticsLatest extends LogisticsLatest {

	private final ShipLatest ship;

	public SeaLogisticsLatest(ShipLatest ship) {
		this.ship = ship;
	}

	@Override
	public String type() {
		return "SEA";
	}

	@Override
	public TransportLatest createTransport() {
		return ship;
	}

}
