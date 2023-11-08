package com.akoman.emailservice.adapters;

public interface EmailSenderGateway {
	void sendEmail(String to, String subject, String body);
}
