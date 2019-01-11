/**
 * 
 */
package com.park.parkingapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Washing;

/**
 * @author Gaurav Kumar
 *
 */
@Repository
public interface WashingRepository extends CrudRepository<Washing, String> {
	List<Washing> findAll();
}
