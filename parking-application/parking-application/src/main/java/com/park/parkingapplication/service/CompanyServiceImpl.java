/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.park.parkingapplication.model.Company;
import com.park.parkingapplication.repository.CompanyRepository;

/**
 * @author Gaurav Kumar
 *
 */

@Service
public class CompanyServiceImpl implements CompanyService {

	final CompanyRepository companyRepository;

	public CompanyServiceImpl(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}

	@Override
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		List<Company> companyList = this.companyRepository.findAll();
		if (companyList == null) {
			throw new RuntimeException("No company found");
		}
		return companyList;
	}

	@Override
	public Company findById(String id) {
		// TODO Auto-generated method stub
		Optional<Company> optionalCompany = this.companyRepository.findById(id);
		if (!optionalCompany.isPresent())
			throw new RuntimeException("Not found");
		return optionalCompany.get();
	}

	@Override
	public Boolean deleteById(String CIN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

}
