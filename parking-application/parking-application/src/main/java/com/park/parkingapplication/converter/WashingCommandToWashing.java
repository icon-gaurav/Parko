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
public class WashingCommandToWashing implements Converter<WashingCommand, Washing> {

	@Override
	public Washing convert(WashingCommand source) {
		if (source == null)
			return null;

		Washing washing = new Washing();
		washing.setId(source.getId());
		washing.setCapacity(source.getCapacity());
		washing.setArea(source.getArea());
		washing.setRate(source.getRate());
		washing.setRating(source.getRating());

		return washing;
	}
}
