package com.bae.service;

import org.springframework.http.ResponseEntity;

public interface SearchService {

		ResponseEntity<String> getName(String name);
		
		ResponseEntity<String> getLocation(String location);

		ResponseEntity<String> getCarReg(String carreg);

}
