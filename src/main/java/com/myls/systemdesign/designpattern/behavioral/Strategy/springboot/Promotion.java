package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "promotion")
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "promo_code", nullable = false, unique = true)
	private String promoCode;

	@Column(name = "strategy_type", nullable = false)
	private String strategyType;

	@Column(name = "discount_value")
	private BigDecimal discountValue;

	@Column(name = "minimum_order_amount")
	private BigDecimal minimumOrderAmount;

	@Column(name = "maximum_discount_amount")
	private BigDecimal maximumDiscountAmount;

	@Column(name = "start_date", nullable = false)
	private LocalDateTime startDate;

	@Column(name = "end_date", nullable = false)
	private LocalDateTime endDate;

	@Column(nullable = false)
	private boolean active;

	@Column(name = "usage_limit")
	private Integer usageLimit;

	@Column(name = "used_count", nullable = false)
	private Integer usedCount;

	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getStrategyType() {
		return strategyType;
	}

	public void setStrategyType(String strategyType) {
		this.strategyType = strategyType;
	}

	public BigDecimal getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(BigDecimal discountValue) {
		this.discountValue = discountValue;
	}

	public BigDecimal getMinimumOrderAmount() {
		return minimumOrderAmount;
	}

	public void setMinimumOrderAmount(BigDecimal minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount;
	}

	public BigDecimal getMaximumDiscountAmount() {
		return maximumDiscountAmount;
	}

	public void setMaximumDiscountAmount(BigDecimal maximumDiscountAmount) {
		this.maximumDiscountAmount = maximumDiscountAmount;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getUsageLimit() {
		return usageLimit;
	}

	public void setUsageLimit(Integer usageLimit) {
		this.usageLimit = usageLimit;
	}

	public Integer getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", promoCode=" + promoCode + ", strategyType=" + strategyType
				+ ", discountValue=" + discountValue + ", minimumOrderAmount=" + minimumOrderAmount
				+ ", maximumDiscountAmount=" + maximumDiscountAmount + ", startDate=" + startDate + ", endDate="
				+ endDate + ", active=" + active + ", usageLimit=" + usageLimit + ", usedCount=" + usedCount
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}