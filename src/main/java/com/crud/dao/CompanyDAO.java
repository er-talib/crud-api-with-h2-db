package com.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Company;

@Repository
public interface CompanyDAO extends CrudRepository<Company, Long>{

}
