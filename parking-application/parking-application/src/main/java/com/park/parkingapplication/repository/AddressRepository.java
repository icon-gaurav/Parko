/**
 * 
 */
package com.park.parkingapplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Address;

/**
 * @author Gaurav Kumar
 *
 */

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
	Optional<Address> findByPin(Integer PIN);

	List<Address> findAll();
}