package com.repex.SpringSamples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceclass")
public class Myservice {
	public Myservice() {
	}

	@Autowired
	private Myrepository myrepository;

	public List<Students> display(int studentId) {
		System.out.println("service");
		return myrepository.findBystudentId( studentId);
	}
	public void save(Students s) {
		myrepository.save(s);
	}
}
