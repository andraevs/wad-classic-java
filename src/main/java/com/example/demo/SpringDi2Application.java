package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controllers.SendNotificationController;

@SpringBootApplication
public class SpringDi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDi2Application.class, args);
		SendNotificationController sn = ctx.getBean(SendNotificationController.class);
		System.out.println(sn.sendNotification());
	}

}
