package com.simplilearn.devops.testdevops;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.simplilearn.devops.testdevops.models.Country;
import com.simplilearn.devops.testdevops.repositories.CountryRepository;

@SpringBootApplication
public class TestdevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestdevopsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner sampleData(CountryRepository countryRepository) {
		return (args) -> {
			countryRepository.saveAndFlush(new Country("BANGLADESH"));
			countryRepository.saveAndFlush(new Country("INDIA"));
			countryRepository.saveAndFlush(new Country("SRILANKA"));
			countryRepository.saveAndFlush(new Country("PAKISTAN"));
			countryRepository.saveAndFlush(new Country("NEPAL"));
			countryRepository.saveAndFlush(new Country("VUTAN"));
		};
	}

}
