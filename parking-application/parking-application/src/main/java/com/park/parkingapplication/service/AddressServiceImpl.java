/**
 * 
 */
package com.park.parkingapplication.service;

import java.util.HashSet;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.park.parkingapplication.model.Address;
import com.park.parkingapplication.repository.AddressRepository;

/**
 * @author Gaurav Kumar
 *
 */


@Service
public class AddressServiceImpl implements AddressService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see service.AddressService#findByPIN(java.lang.Integer)
	 */

	private final AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address findByPIN(Integer PIN) {
		// TODO Auto-generated method stub
		Optional<Address> optionalAddress = this.addressRepository.findByPin(PIN);
		if (!optionalAddress.isPresent())
			throw new RuntimeException("Address not found");
		return optionalAddress.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see service.AddressService#deleteByPIN(java.lang.Integer)
	 */
	@Override
	public void deleteByPIN(Integer PIN) {
		// TODO Auto-generated method stub
		this.addressRepository.deleteById(PIN);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see service.AddressService#getAddress()
	 */
	@Override
	public Set<Address> getAddress() {
		// TODO Auto-generated method stub
		Set<Address> addressSet = new HashSet<Address>();
		this.addressRepository.findAll().iterator().forEachRemaining(e -> addressSet.add(e));
		return addressSet;
	}

}
