package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Citizen;
@Repository
public interface CitizenRepository extends MongoRepository<Citizen, Long> {

}
