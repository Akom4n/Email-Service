package com.akoman.emailservice.application;

import com.akoman.emailservice.core.EmailSenderUserCase;

public class EmailSenderService implements EmailSenderUserCase{

	
	private final EmailSenderGateway emailSenderGateway;
	
	@AutoWired
	public EmailSenderService(EmailSenderGateway emailGateway) {
		this.emailSenderGateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		
	}

}
