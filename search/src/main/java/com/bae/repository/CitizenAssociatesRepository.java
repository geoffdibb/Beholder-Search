package com.bae.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bae.entity.CitizenAssociates;

@Repository
public interface CitizenAssociatesRepository extends MongoRepository<CitizenAssociates, Long> {

	@Query(value = "{'surname': {$regex : ?0, $options: 'i'}}")
	List<CitizenAssociates> findBySurnameRegexIgnoreCase(String surname);

	@Query(value = "{'forenames': {$regex : ?0, $options: 'i'}}")
	List<CitizenAssociates> findByForenamesRegexIgnoreCase(String forename);

}
