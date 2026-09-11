package com.myls.systemdesign.designpattern.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
	public String createShipment(String orderId, String address) {

		System.out.println("Creating shipment for order " + orderId);

		return "SHIP-" + System.currentTimeMillis();
	}

	public void cancelShipment(String shipmentId) {

		System.out.println("Cancelling shipment: " + shipmentId);
	}

}
