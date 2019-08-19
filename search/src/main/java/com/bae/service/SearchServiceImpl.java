package com.bae.service;



import java.util.ArrayList;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bae.entity.Citizen;
import com.bae.repository.CitizenRepository;
@Service
public class SearchServiceImpl implements SearchService {

	private CitizenRepository repository;

	
	@Override
	public ArrayList<Citizen> getName(String name) {
		ArrayList<Citizen> foundList = new ArrayList<Citizen>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (name == list.get(i).getForenames()) {
				foundList.add(list.get(i));
				}
		}
		return foundList;
		}

	@Override
	public ArrayList<Citizen> getLocation(String location) {
		ArrayList<Citizen> foundList = new ArrayList<Citizen>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (location == list.get(i).getHomeAddress()) {
				foundList.add(list.get(i));
				}
			
		}
		
		return foundList;
		}
	

	@Override
	public ArrayList<Citizen> getCarReg(String carreg) {
		ArrayList<Citizen> foundList = new ArrayList<Citizen>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (carreg == list.get(i).getVehicleRegistrationNumber()) {
				foundList.add(list.get(i));
				}
		}
			return foundList;

		}
	@Override
	public ArrayList<Citizen> getId(String id) {
		ArrayList<Citizen> foundList = new ArrayList<Citizen>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (id == list.get(i).getCitizenId()) {
				foundList.add(list.get(i));
				}
		}
			return foundList;

		}

}


