package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import org.springframework.stereotype.Component;

@Component
public class RoadLogisticsLatest extends LogisticsLatest {

	private final TruckLatest truck;

	public RoadLogisticsLatest(TruckLatest truck) {
		this.truck = truck;
	}

	@Override
	public String type() {
		return "ROAD";
	}

	@Override
	public TransportLatest createTransport() {
		return truck;
	}

}
