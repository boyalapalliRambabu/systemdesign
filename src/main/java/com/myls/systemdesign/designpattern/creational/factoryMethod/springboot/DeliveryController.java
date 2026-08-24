package com.myls.systemdesign.designpattern.creational.factoryMethod.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/delivery")
@RestController
public class DeliveryController {

	private final DeliveryService deliveryService;

	public DeliveryController(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@PostMapping
	public ResponseEntity<String> deliver(@RequestParam String type) {

		deliveryService.deliver(type);

		return ResponseEntity.ok("Delivery planned successfully");
	}
}
