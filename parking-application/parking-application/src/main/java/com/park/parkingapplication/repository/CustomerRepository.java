/**
 * 
 */
package com.park.parkingapplication.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Customer;

/**
 * @author Gaurav Kumar
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
	Optional<Customer> findByUserName(String userName);

}
