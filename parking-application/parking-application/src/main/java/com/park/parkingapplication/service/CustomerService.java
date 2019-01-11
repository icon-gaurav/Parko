/**
 * 
 */
package com.park.parkingapplication.service;

import com.park.parkingapplication.command.CustomerCommand;
import com.park.parkingapplication.model.Customer;

/**
 * @author Gaurav Kumar
 *
 */
public interface CustomerService {

	CustomerCommand saveCustomerCommand(CustomerCommand command);

	CustomerCommand findCommandByUserName(String userName);

	Customer findByUserName(String userName);

}
