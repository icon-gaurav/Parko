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
public class CustomerCommandToCustomer implements Converter<CustomerCommand, Customer> {

	@Override
	public Customer convert(CustomerCommand source) {
		if (source == null) {
			return null;
		}

		final Customer customer = new Customer();
		customer.setUserName(source.getUsername());
		customer.setVehicleNum(source.getVehicleNum());
		customer.setEmail(source.getEmail());
		customer.setContact(source.getContact());
		customer.setRegDate(Date.valueOf(LocalDate.now()));
		customer.setIsRegCustomer(false);
		return customer;
	}

}
