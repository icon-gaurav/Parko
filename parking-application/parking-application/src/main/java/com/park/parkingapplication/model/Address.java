/**
 * 
 */
package com.park.parkingapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author Gaurav Kumar
 *
 */

@Entity
public class Address {
	@Id
	private String latitude;
	private String street;
	private String city;
	private String nearBy;
	private String State;
	private Integer pin;

	public Address(String latitude, String street, String city, String nearBy, String state, Integer pIN) {
		super();
		this.latitude = latitude;
		this.street = street;
		this.city = city;
		this.nearBy = nearBy;
		State = state;
		pin = pIN;
	}

	public Address() {
		super();
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNearBy() {
		return nearBy;
	}

	public void setNearBy(String nearBy) {
		this.nearBy = nearBy;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pIN) {
		pin = pIN;
	}

}
