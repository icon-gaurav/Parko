/**
 * 
 */
package com.park.parkingapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.park.parkingapplication.model.Maintenance;

/**
 * @author Gaurav Kumar
 *
 */
@Repository
public interface MaintenanceRepository extends CrudRepository<Maintenance, String> {
	List<Maintenance> findAll();
}
