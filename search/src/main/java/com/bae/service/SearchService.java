package com.bae.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface SearchService {

	List<Object> getName(String name);

	List<Object> getLocation(String location);

	List<Object> getSuspectCar(String carreg);

	List<Object> getId(String id);

}
