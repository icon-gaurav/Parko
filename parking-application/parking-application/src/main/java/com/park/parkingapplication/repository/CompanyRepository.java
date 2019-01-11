/**
 * 
 */
package com.park.parkingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Company;

import java.util.List;
import java.util.Optional;

/**
 * @author Gaurav Kumar
 *
 */

@Repository
public interface CompanyRepository extends CrudRepository<Company, String> {
	Optional<Company> findById(String id);

	List<Company> findAll();
}
