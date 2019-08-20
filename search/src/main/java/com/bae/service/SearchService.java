package com.bae.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.entity.Citizen;

@Service
public interface SearchService {

		List<Citizen> getName(String name);
		
		List<Citizen> getLocation(String location);

		List<Citizen> getCarReg(String carreg);
		
		List<Citizen> getId(String id);

}
