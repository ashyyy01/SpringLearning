package com.example.spring.SpringSamples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {
	public HomeController2() {
		System.out.println("venom");
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello2() {
		return "Venom";
	}
}