package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Associate;
@Repository
	public interface AssociateRepository extends MongoRepository<Associate, Long> {

	}


