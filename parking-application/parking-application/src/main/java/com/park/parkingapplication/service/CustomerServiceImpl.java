/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.park.parkingapplication.command.CustomerCommand;
import com.park.parkingapplication.converter.CustomerCommandToCustomer;
import com.park.parkingapplication.converter.CustomerToCustomerCommand;
import com.park.parkingapplication.model.Customer;
import com.park.parkingapplication.repository.CustomerRepository;

import javassist.NotFoundException;

/**
 * @author Gaurav Kumar
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	final CustomerRepository customerRepository;
	final CustomerCommandToCustomer customerCommandToCustomer;
	final CustomerToCustomerCommand customerToCustomerCommand;

	public CustomerServiceImpl(CustomerRepository customerRepository,
			CustomerCommandToCustomer customerCommandToCustomer, CustomerToCustomerCommand customerToCustomerCommand) {
		super();
		this.customerRepository = customerRepository;
		this.customerCommandToCustomer = customerCommandToCustomer;
		this.customerToCustomerCommand = customerToCustomerCommand;
	}

	@Override
	public CustomerCommand saveCustomerCommand(CustomerCommand command) {
		Customer detachedCustomer = customerCommandToCustomer.convert(command);
		Customer savedCustomer = customerRepository.save(detachedCustomer);
		return customerToCustomerCommand.convert(savedCustomer);
	}

	@Override
	public CustomerCommand findCommandByUserName(String userName) {
		CustomerCommand command = customerToCustomerCommand.convert(this.findByUserName(userName));
		return command;
	}

	@Override
	public Customer findByUserName(String userName) {
		Optional<Customer> customerOptional = customerRepository.findByUserName(userName);
		if (!customerOptional.isPresent()) {
			// throw new NotFoundException("Customer Not Found with UserName : "+userName);
		}
		return customerOptional.get();
	}

}
