package com.myls.systemdesign.designpattern.structural.adapter.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
	@Bean
	public LegacyPaymentGatewayLatest legacyPaymentGateway() {
		return new LegacyPaymentGatewayLatest();
	}
}
