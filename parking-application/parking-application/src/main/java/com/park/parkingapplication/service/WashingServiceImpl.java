/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.park.parkingapplication.model.Washing;
import com.park.parkingapplication.repository.WashingRepository;

/**
 * @author Gaurav Kumar
 *
 */
@Service
public class WashingServiceImpl implements WashingService {
	final WashingRepository washingRepository;

	public WashingServiceImpl(WashingRepository washingRepository) {
		super();
		this.washingRepository = washingRepository;
	}

	@Override
	public List<Washing> findAll() {
		List<Washing> washingList = this.washingRepository.findAll();
		if (washingList == null)
			return null;
		return washingList;
	}

}
