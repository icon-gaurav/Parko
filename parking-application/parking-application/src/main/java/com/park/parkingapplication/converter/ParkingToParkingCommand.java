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
public class ParkingToParkingCommand implements Converter<Parking, ParkingCommand> {

	@Override
	public ParkingCommand convert(Parking source) {
		if (source == null)
			return null;

		ParkingCommand parkingCommand = new ParkingCommand();
		parkingCommand.setId(source.getId());
		parkingCommand.setBikeCapacity(source.getBikeCapacity());
		parkingCommand.setCarCapacity(source.getCarCapacity());
		parkingCommand.setHeavyVehicleCapacity(source.getHeavyVehicleCapacity());
		parkingCommand.setAvailable(source.getAvailable());
		parkingCommand.setArea(source.getArea());
		parkingCommand.setRent(source.getRent());
		parkingCommand.setRating(source.getRating());

		return parkingCommand;
	}

}
