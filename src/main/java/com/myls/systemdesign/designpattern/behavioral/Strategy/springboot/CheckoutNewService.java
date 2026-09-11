package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class CheckoutNewService {

	private final PromotionService promotionService;
	private final DiscountStrategyFactory strategyFactory;

	public CheckoutNewService(PromotionService promotionService, DiscountStrategyFactory strategyFactory) {
		this.promotionService = promotionService;
		this.strategyFactory = strategyFactory;
	}

	public CheckoutNewResponse checkout(CheckoutNewRequest request) {

		Promotion promotion = promotionService.getValidPromotion(request.getPromoCode());
		validateMinimumOrder(request.getSubtotal(), promotion);
		DiscountStrategy strategy = strategyFactory.getStrategy(promotion.getStrategyType());
		BigDecimal discount = strategy.calculateDiscount(request.getSubtotal(), promotion.getDiscountValue(),
				promotion.getMaximumDiscountAmount());
		BigDecimal finalAmount = request.getSubtotal().subtract(discount);

		return new CheckoutNewResponse(promotion.getPromoCode(), request.getSubtotal(), discount, finalAmount);
	}

	private void validateMinimumOrder(BigDecimal subtotal, Promotion promotion) {

		if (promotion.getMinimumOrderAmount() != null && subtotal.compareTo(promotion.getMinimumOrderAmount()) < 0) {

			throw new InvalidPromotionException("Minimum order amount is " + promotion.getMinimumOrderAmount());
		}
	}
}
