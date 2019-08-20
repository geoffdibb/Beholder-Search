package com.bae.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Citizen;
import com.bae.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	public SearchService service;

	@Autowired
	public SearchController(SearchService service) {
		this.service = service;
	}

	@GetMapping("/name/{name}")
	public ArrayList<Citizen> getName(@PathVariable("name") String name) {
		return service.getName(name);
	}

	@GetMapping("/location/{location}")
	public ArrayList<Citizen> getLocation(@PathVariable("location") String location) {
		return service.getLocation(location);
	}

	@GetMapping("/carreg/{carreg}")
	public ArrayList<Citizen> getCarReg(@PathVariable("carreg") String carreg) {
		return service.getCarReg(carreg);
	}
	
	@GetMapping("/id/{id}")
	public ArrayList<Citizen> getId(@PathVariable("id") String id) {
		return service.getId(id);
	}
}
