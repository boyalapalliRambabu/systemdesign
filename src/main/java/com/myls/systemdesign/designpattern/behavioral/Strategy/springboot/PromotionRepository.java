package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {

	Optional<Promotion> findByPromoCodeAndActiveTrue(String promoCode);

	Optional<Promotion> findByPromoCodeAndActiveTrueAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
			String promoCode, LocalDateTime currentTime, LocalDateTime currentTime1);

}
