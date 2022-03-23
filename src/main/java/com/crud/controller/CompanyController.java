package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Company;
import com.crud.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService ;
	
	@PostMapping("/company")
	public Company saveDetails(@RequestBody Company company) {
		
		return this.companyService.addDetails(company);
	}
	
	@GetMapping("/company")
	public List<Company> find(){
		
		return this.companyService.findDetails();
	}
	
	@GetMapping("/company/{id}")
	public Optional<Company> findById(@PathVariable("id") long id){
		return this.companyService.findDetailsById(id);
	}
	
	@PutMapping("/company")
	public void update(@RequestBody Company company) {
		this.companyService.updateDetails(company);
	}
	
	@DeleteMapping("/company/{id}")
	public void delete(@PathVariable long id ) {
		this.companyService.deleteDetails(id);
	}
	
}
