package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	public SearchService service;

	@Autowired
	public SearchController(SearchService service) {
		this.service = service;
	}

	@GetMapping("/getName/{name}")
	public ResponseEntity<String> getName(@PathVariable("name") String name) {
		return service.getName(name);
	}

	@GetMapping("/getLocation/{location}")
	public ResponseEntity<String> getLocation(@PathVariable("location") String location) {
		return service.getLocation(location);
	}

	@GetMapping("/getCarReg/{carreg}")
	public ResponseEntity<String> getCarReg(@PathVariable("carreg") String carreg) {
		return service.getCarReg(carreg);
	}
}
