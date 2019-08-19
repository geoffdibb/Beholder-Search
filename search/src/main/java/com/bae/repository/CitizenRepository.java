package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.Citizen;

public interface CitizenRepository extends MongoRepository<Citizen, Long> {

}
