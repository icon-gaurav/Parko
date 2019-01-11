/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;

import com.park.parkingapplication.model.Maintenance;

/**
 * @author Gaurav Kumar
 *
 */
public interface MaintenanceService {
	List<Maintenance> findAll();
}
