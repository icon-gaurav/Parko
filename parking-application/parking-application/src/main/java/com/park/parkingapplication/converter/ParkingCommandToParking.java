/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;

import com.park.parkingapplication.command.ParkingCommand;
import com.park.parkingapplication.model.Parking;

/**
 * @author Gaurav Kumar
 *
 */
public class ParkingCommandToParking implements Converter<ParkingCommand, Parking> {

	@Override
	public Parking convert(ParkingCommand source) {
		if (source == null)
			return null;

		Parking parking = new Parking();
		parking.setId(source.getId());
		parking.setBikeCapacity(source.getBikeCapacity());
		parking.setCarCapacity(source.getCarCapacity());
		parking.setHeavyVehicleCapacity(source.getHeavyVehicleCapacity());
		parking.setAvailable(source.getAvailable());
		parking.setArea(source.getArea());
		parking.setRent(source.getRent());
		parking.setRating(source.getRating());

		return parking;
	}

}
