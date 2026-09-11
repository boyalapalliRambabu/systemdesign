package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DiscountStrategyFactory {

	private final Map<String, DiscountStrategy> strategies;

	public DiscountStrategyFactory(Map<String, DiscountStrategy> strategies) {
		this.strategies = strategies;
	}

	public DiscountStrategy getStrategy(String strategyType) {

		System.out.println("strategies " + strategies);
		DiscountStrategy strategy = strategies.get(strategyType);

		if (strategy == null) {
			throw new InvalidPromotionException("Unsupported strategy type: " + strategyType);
		}

		return strategy;
	}
}
