package com.bae.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bae.entity.Citizen;

@Service
public interface SearchService {

		ArrayList<Citizen> getName(String name);
		
		ArrayList<Citizen> getLocation(String location);

		ArrayList<Citizen> getCarReg(String carreg);
		
		ArrayList<Citizen> getId(String id);

}
