/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;

import com.park.parkingapplication.command.CompanyCommand;
import com.park.parkingapplication.model.Company;

/**
 * @author Gaurav Kumar
 *
 */
public interface CompanyService {
	List<Company> findAll();

	Company findById(String id);

	Boolean deleteById(String id);

	Boolean update(Company company);

	CompanyCommand saveCompanyCommand(CompanyCommand companyCommand);
}
