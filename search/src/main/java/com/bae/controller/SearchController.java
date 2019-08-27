package com.bae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("${path.searchCategory}")
	public List<Object> search(@PathVariable("category") String category,
			@PathVariable("searchTerm") String searchTerm) {
		return service.search(category, searchTerm);
	}

}
