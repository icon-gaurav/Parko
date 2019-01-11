/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.park.parkingapplication.model.Maintenance;
import com.park.parkingapplication.repository.MaintenanceRepository;

/**
 * @author Gaurav Kumar
 *
 */
@Service
public class MaintenanceServiceImp implements MaintenanceService {
	final MaintenanceRepository maintenanceRepository;

	public MaintenanceServiceImp(MaintenanceRepository maintenanceRepository) {
		super();
		this.maintenanceRepository = maintenanceRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.park.parkingapplication.service.MaintenanceService#findAll()
	 */
	@Override
	public List<Maintenance> findAll() {
		List<Maintenance> maintenanceList = this.maintenanceRepository.findAll();
		if (maintenanceList == null)
			return null;
		return maintenanceList;
	}

}
