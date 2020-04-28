package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class EmailMessagingService implements MessagingService{

	@Override
	public String sendNotification() {
		return "sent an email message";
	}

}
