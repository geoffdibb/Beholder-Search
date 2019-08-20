package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Incident;

@Repository
	public interface IncidentRepository extends MongoRepository<Incident, Long> {

}
