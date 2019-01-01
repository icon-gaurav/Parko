/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.Set;

import com.park.parkingapplication.model.Address;

/**
 * @author Gaurav Kumar
 *
 */
public interface AddressService {
	Address findByPIN(Integer PIN);

	void deleteByPIN(Integer PIN);

	Set<Address> getAddress();
}
