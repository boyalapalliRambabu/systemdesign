//package com.myls.systemdesign.designpattern.behavioral.Strategy;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class StrategyCheckoutService {
//
//	private DiscountStrategy strategy;
//
//	public StrategyCheckoutService(DiscountStrategy strategy) {
//		this.strategy = strategy;
//	}
//
//	void setStrategy(DiscountStrategy strategy) {
//		this.strategy = strategy;
//	}
//
//	double checkOut(double subTotal) {
//		return strategy.applyDiscount(subTotal);
//	}
//}
