/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;

import com.park.parkingapplication.model.Company;

/**
 * @author Gaurav Kumar
 *
 */
public interface CompanyService {
	List<Company> findAll();

	Company findById(String CIN);

	Boolean deleteById(String CIN);

	Boolean update(Company company);
}
