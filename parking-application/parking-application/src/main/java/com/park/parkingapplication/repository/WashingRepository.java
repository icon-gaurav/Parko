/**
 * 
 */
package com.park.parkingapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.park.parkingapplication.model.Washing;

/**
 * @author Gaurav Kumar
 *
 */
public interface WashingRepository extends CrudRepository<Washing, String> {

}
