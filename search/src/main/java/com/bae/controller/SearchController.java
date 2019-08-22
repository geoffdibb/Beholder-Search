package com.bae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Citizen;
import com.bae.entity.SuspectCar;
import com.bae.service.SearchService;

@RestController
@RequestMapping("${path.search}")
public class SearchController {
	private SearchService service;

	@Autowired
	public SearchController(SearchService service) {
		this.service = service;
	}

	public SearchService getService() {
		return service;
	}

	public void setService(SearchService service) {
		this.service = service;
	}

	@GetMapping("${path.name}")
	public List<Citizen> getName(@PathVariable("name") String name) {
		return service.getName(name);
	}

	@GetMapping("${path.location}")
	public List<Citizen> getLocation(@PathVariable("location") String location) {
		return service.getLocation(location);
	}

	@GetMapping("${path.carreg}")
	public List<SuspectCar> getCarReg(@PathVariable("carReg") String carreg) {
		return service.getSuspectCar(carreg);
	}

	@GetMapping("${path.profileId}")
	public List<Citizen> getId(@PathVariable("id") String id) {
		return service.getId(id);
	}
}
