package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutNewController {

	private final CheckoutNewService checkoutService;

	public CheckoutNewController(CheckoutNewService checkoutService) {

		this.checkoutService = checkoutService;
	}

	@PostMapping
	public CheckoutNewResponse checkout(@Valid @RequestBody CheckoutNewRequest request) {

		return checkoutService.checkout(request);
	}

}
