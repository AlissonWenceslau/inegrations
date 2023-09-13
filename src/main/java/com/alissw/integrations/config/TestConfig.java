package com.alissw.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alissw.integrations.services.EmailService;
import com.alissw.integrations.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Bean
	public EmailService mock() {
		return new MockEmailService();
	}
}
