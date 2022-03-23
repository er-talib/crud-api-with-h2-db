package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.CompanyDAO;
import com.crud.entity.Company;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	private CompanyDAO companyDAO;

	@Override
	public Company addDetails(Company company) {
		return this.companyDAO.save(company);
	}

	@Override
	public List<Company> findDetails() {
		return (List<Company>) this.companyDAO.findAll();
	}

	@Override
	public Optional<Company> findDetailsById(long id) {

		return this.companyDAO.findById(id);
	}
	@Override
	public void updateDetails(Company company) {
		
		this.companyDAO.save(company);
		
	}
	@Override
	public void deleteDetails(long id) {
		
		this.companyDAO.deleteById(id);
		
	}

}
