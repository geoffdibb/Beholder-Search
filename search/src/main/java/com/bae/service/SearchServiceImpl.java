package com.bae.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.Citizen;
import com.bae.repository.CitizenRepository;

@Service
public class SearchServiceImpl implements SearchService {
	

	@Autowired 
	private CitizenRepository repository;

	
	@Override
	public List<Citizen> getName(String name) {
		List<Citizen> foundList = new ArrayList<>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (name.contentEquals( list.get(i).getForenames())) {
				foundList.add(list.get(i));
				}  
		}
		return foundList;
		}

	@Override
	public List<Citizen> getLocation(String location) {
		List<Citizen> foundList = new ArrayList<>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (location.equals( list.get(i).getHomeAddress())) {
				foundList.add(list.get(i));
				}
			
		}
		
		return foundList;
		}
	

	@Override
	public List<Citizen> getCarReg(String carreg) {
		List<Citizen> foundList = new ArrayList<>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (carreg.equals( list.get(i).getVehicleRegistrationNumber())) {
				foundList.add(list.get(i));
				}
		}
			return foundList;

		}
	@Override
	public List<Citizen> getId(String id) {
		List<Citizen> foundList = new ArrayList<>();
		List<Citizen> list = repository.findAll();
		for (int i = 0; i<list.size(); i++) {
			if (id.contentEquals( list.get(i).getCitizenId())){
				foundList.add(list.get(i));
				}
		}
			return foundList;

		}

}


