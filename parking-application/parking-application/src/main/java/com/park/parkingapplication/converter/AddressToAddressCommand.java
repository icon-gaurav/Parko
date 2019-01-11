/**
 * 
 */
package com.park.parkingapplication.converter;

import org.springframework.core.convert.converter.Converter;

import com.park.parkingapplication.command.AddressCommand;
import com.park.parkingapplication.model.Address;

/**
 * @author Gaurav Kumar
 *
 */
public class AddressToAddressCommand implements Converter<Address, AddressCommand> {

	@Override
	public AddressCommand convert(Address source) {
		if (source == null)
			return null;
		AddressCommand addressCommand = new AddressCommand();
		addressCommand.setLatitude(source.getLatitude());
		addressCommand.setStreet(source.getStreet());
		addressCommand.setNearBy(source.getNearBy());
		addressCommand.setCity(source.getCity());
		addressCommand.setPin(source.getPin());
		addressCommand.setState(source.getState());

		return addressCommand;
	}
}
