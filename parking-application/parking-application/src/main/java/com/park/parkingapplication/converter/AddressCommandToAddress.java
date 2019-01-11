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
public class AddressCommandToAddress implements Converter<AddressCommand, Address> {

	@Override
	public Address convert(AddressCommand source) {
		if (source == null)
			return null;
		Address address = new Address();
		address.setLatitude(source.getLatitude());
		address.setStreet(source.getStreet());
		address.setNearBy(source.getNearBy());
		address.setCity(source.getCity());
		address.setPin(source.getPin());
		address.setState(source.getState());

		return address;
	}

}
