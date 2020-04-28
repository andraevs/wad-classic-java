package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

import com.example.demo.services.MessagingService;

@Controller
public class SendNotificationController {
	

	private MessagingService messagingService;
	
	/*
	 * Constructor dependency injection. Check also setter and field injection.
	 */
	public SendNotificationController(MessagingService messagingService) {
		super();
		this.messagingService = messagingService;
	}




	public String sendNotification() {
		return messagingService.sendNotification();
	}

}
