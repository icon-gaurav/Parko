/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.park.parkingapplication.model.Parking;
import com.park.parkingapplication.repository.ParkingRepository;

/**
 * @author Gaurav Kumar
 *
 */
@Service
public class ParkingServiceImpl implements ParkingService {
	final ParkingRepository parkingRepository;

	public ParkingServiceImpl(ParkingRepository parkingRepository) {
		super();
		this.parkingRepository = parkingRepository;
	}

	public List<Parking> findAll() {
		List<Parking> parkingList = this.parkingRepository.findAll();
		if (parkingList == null)
			return null;
		return parkingList;
	}
}
