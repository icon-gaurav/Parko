/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;

import com.park.parkingapplication.command.WashingCommand;
import com.park.parkingapplication.model.Washing;

/**
 * @author Gaurav Kumar
 *
 */
public class WashingToWashingCommand implements Converter<Washing, WashingCommand> {

	@Override
	public WashingCommand convert(Washing source) {
		if (source == null)
			return null;

		WashingCommand washingCommand = new WashingCommand();
		washingCommand.setId(source.getId());
		washingCommand.setCapacity(source.getCapacity());
		washingCommand.setArea(source.getArea());
		washingCommand.setRate(source.getRate());
		washingCommand.setRating(source.getRating());

		return washingCommand;
	}

}
