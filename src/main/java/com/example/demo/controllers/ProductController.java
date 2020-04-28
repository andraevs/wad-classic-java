package com.example.demo.controllers;

import java.util.Iterator;

import org.springframework.stereotype.Controller;

import com.example.demo.domain.Product;
import com.example.demo.services.ProductRepository;

@Controller
public class ProductController {
	
	private ProductRepository pr;
	
	
	public ProductController(ProductRepository pr) {
		super();
		this.pr = pr;
	}



	public void displayProducts() {
		Iterator<Product> it = pr.findAll().iterator();
		while(it.hasNext())
			System.out.println(it.next().getName());
			}

}
