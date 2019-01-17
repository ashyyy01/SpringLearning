package com.repex.SpringSamples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Studentinfo")
public class Mycontroller {
	@Autowired
	private Myservice myservice;

	@PostMapping(value = "/id")
	public List<Students> getId(@RequestBody int studentId) {
		System.out.println("controller");
		return  myservice.display(studentId);
	}
	@PostMapping(value="/save")
	public void save(@RequestBody Students studentId){
		myservice.save(studentId);
		System.out.println(studentId);
	}
}