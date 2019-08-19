package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.Incident;


	public interface IncidentRepository extends MongoRepository<Incident, Long> {

}
