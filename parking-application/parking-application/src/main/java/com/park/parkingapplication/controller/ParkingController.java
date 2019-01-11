/**
 * 
 */
package com.park.parkingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.park.parkingapplication.service.ParkingService;

/**
 * @author Gaurav Kumar
 *
 */
@Controller
public class ParkingController {
	private ParkingService parkingService;

	@Autowired
	public void setParkingService(ParkingService parkingService) {
		this.parkingService = parkingService;
	}

	
}
