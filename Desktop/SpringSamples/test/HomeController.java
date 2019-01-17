package com.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", consumes = "application/json")
public class HomeController {

	public HomeController() {
		System.out.println("strange");
	}

	@Autowired
	Appdisplay appdisplay;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Integer> hello(
			@RequestBody SpringBootExampleApplication springapp) {
		return (appdisplay.display(springapp));

	}
}