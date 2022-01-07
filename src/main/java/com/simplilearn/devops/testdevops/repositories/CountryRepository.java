package com.simplilearn.devops.testdevops.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.devops.testdevops.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	Optional<Country> findByName(String name);
}
