package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.SuspectCar;

	public interface SuspectCarRepository extends MongoRepository<SuspectCar, Long> {

}
