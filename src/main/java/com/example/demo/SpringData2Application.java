package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controllers.ProductController;

@SpringBootApplication
public class SpringData2Application {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringData2Application.class, args);
		ProductController pc = ctx.getBean(ProductController.class);
		pc.displayProducts();
	}

}
