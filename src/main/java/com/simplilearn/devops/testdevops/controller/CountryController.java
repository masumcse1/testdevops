package com.simplilearn.devops.testdevops.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.devops.testdevops.models.Country;
import com.simplilearn.devops.testdevops.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	private CountryService countryService;

	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}
	
	@GetMapping
	public List<Country> allCountries() {
		return countryService.findAllCountries();
	}

	@GetMapping("/{id}")
	public Optional<Country> findCountryById(@PathVariable("id") int id) {
		return countryService.findCountryById(id);
	}
	
//	@GetMapping("/{name}")
//	public Optional<Country> findCountryByName(@PathVariable("name") String name) {
//		return countryService.findCountryByName(name);
//	}
	
	@PostMapping("/create")
	public Country createCountry(@RequestBody Country country) {
		return countryService.saveCountry(country);
	}
	
	@PutMapping("/update")
	public Country updateCountry(@RequestBody Country country) {
		return countryService.saveCountry(country);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteteCountry(@PathVariable("id") int id) {
		countryService.deleteCountryById(id);
	}
}
