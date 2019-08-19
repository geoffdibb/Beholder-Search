package com.bae.service;

import java.util.ArrayList;


import org.springframework.http.ResponseEntity;

import com.bae.entity.Citizen;

public interface SearchService {

		ArrayList<Citizen> getName(String name);
		
		ArrayList<Citizen> getLocation(String location);

		ArrayList<Citizen> getCarReg(String carreg);
		
		ArrayList<Citizen> getId(String id);

}
