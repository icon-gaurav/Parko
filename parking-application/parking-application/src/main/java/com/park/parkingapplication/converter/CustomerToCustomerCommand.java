/**
 * 
 */
package com.park.parkingapplication.converter;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.park.parkingapplication.command.CustomerCommand;
import com.park.parkingapplication.model.Customer;

/**
 * @author Gaurav Kumar
 *
 */
@Component
public class CustomerToCustomerCommand implements Converter<Customer, CustomerCommand> {

	@Override
	public CustomerCommand convert(Customer source) {
		if (source == null)
			return null;

		final CustomerCommand customerCommand = new CustomerCommand();
		customerCommand.setUsername(source.getUserName());
		customerCommand.setVehicleNum(source.getVehicleNum());
		customerCommand.setEmail(source.getEmail());
		customerCommand.setContact(source.getContact());
		customerCommand.setRegDate(Date.valueOf(LocalDate.now()));
		return customerCommand;
	}

}
