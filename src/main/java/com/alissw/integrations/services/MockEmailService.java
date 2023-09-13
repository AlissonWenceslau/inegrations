package com.alissw.integrations.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alissw.integrations.dto.EmailDTO;

public class MockEmailService implements EmailService {
	
	public static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendEmail(EmailDTO dto) {
		LOG.info("Sending email...");
		LOG.info("Email sent!");
	}
}
