/**
 * 
 */
package com.park.parkingapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Parking;

/**
 * @author Gaurav Kumar
 *
 */
@Repository
public interface ParkingRepository extends CrudRepository<Parking, String> {
	List<Parking> findAll();
}
