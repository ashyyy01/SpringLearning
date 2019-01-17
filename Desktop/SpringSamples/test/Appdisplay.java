package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Appdisplay  {
	Map<String, Integer> display(SpringBootExampleApplication springapp) {
		Map<String, Integer> output = new HashMap<>();
		Integer number = springapp.getNumber1() + springapp.getNumber2();
		output.put(springapp.text, number);
		return output;
	}
}