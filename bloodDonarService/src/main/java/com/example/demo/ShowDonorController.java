package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowDonorController {

	@Autowired
	private DonarRepo repo;
	
	@GetMapping("/add/{name}/{group}")
	public BloodDonar add(@PathVariable String name ,@PathVariable String group) {
		
		return repo.save(new BloodDonar(name, group));
		
	}
}
