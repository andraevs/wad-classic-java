package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.dto.Person;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("")
	public String home(Model model) {
		System.out.println("Passsing trough home controller - home");
		model.addAttribute("person", new Person());
		return "form";
	}
	
	@PostMapping("users")
	@ResponseStatus(code = HttpStatus.OK)
	public void processForm(@ModelAttribute("person") Person pers) {
		System.out.println(pers.getName());
	}

}
