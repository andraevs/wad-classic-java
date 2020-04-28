package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class TelMessagingService implements MessagingService{

	@Override
	public String sendNotification() {
		// TODO Auto-generated method stub
		return "made a phone call";
	}

}
