package com.myls.systemdesign.designpattern.structural.decorator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {

	@Bean
	public NotificationSender notificationSender() {
		NotificationSender sender = new EmailNotificationSender();
		sender = new LoggingNotificationDecorator(sender);
		sender = new MetricsNotificationDecorator(sender);

		sender = new RetryNotificationDecorator(sender);

		return sender;

	}

}
