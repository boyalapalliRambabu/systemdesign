package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class PromotionService {

	private final PromotionRepository repository;

	public PromotionService(PromotionRepository repository) {
		this.repository = repository;
	}

	public Promotion getValidPromotion(String promoCode) {
		LocalDateTime now = LocalDateTime.now();
		return repository
				.findByPromoCodeAndActiveTrueAndStartDateLessThanEqualAndEndDateGreaterThanEqual(promoCode, now, now)
				.orElseThrow(() -> new InvalidPromotionException("Invalid or expired promotion: " + promoCode));

	}
}
