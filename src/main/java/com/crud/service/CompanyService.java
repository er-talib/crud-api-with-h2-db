package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.entity.Company;

public interface CompanyService {
	
	public Company addDetails(Company company);
	public List<Company> findDetails();
	public Optional<Company> findDetailsById(long id);
	public void updateDetails( Company company);
	public void deleteDetails( long id);

}
