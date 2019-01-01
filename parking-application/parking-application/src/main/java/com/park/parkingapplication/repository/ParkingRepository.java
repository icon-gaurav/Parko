/**
 * 
 */
package com.park.parkingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Parking;

/**
 * @author Gaurav Kumar
 *
 */
@Repository
public interface ParkingRepository extends CrudRepository<Parking, String> {

}
