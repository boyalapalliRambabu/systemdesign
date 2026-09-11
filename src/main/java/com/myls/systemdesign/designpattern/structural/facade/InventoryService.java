package com.myls.systemdesign.designpattern.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

	public boolean checkAvailability(String productId, int quantity) {

		System.out.println("Checking inventory for product: " + productId);

		// simulating inventory check
		return quantity > 0;
	}

	public void reserveStock(String productId, int quantity) {
		System.out.println("Reserving " + quantity + " units of " + productId);
	}

	public void releaseStock(String productId, int quantity) {
		System.out.println("Releasing " + quantity + " units of " + productId);
	}

}
