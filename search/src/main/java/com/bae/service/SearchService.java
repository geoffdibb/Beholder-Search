package com.bae.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.entity.Citizen;
import com.bae.entity.SuspectCar;

@Service
public interface SearchService {

	List<Citizen> getName(String name);

	List<Citizen> getLocation(String location);

	List<SuspectCar> getSuspectCar(String carreg);

	List<Citizen> getId(String id);

}
