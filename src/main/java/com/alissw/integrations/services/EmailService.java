package com.alissw.integrations.services;

import com.alissw.integrations.dto.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
