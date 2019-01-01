/**
 * 
 */
package com.park.parkingapplication.command;

/**
 * @author Gaurav Kumar
 *
 */
public class AddressCommand {
	private String latitude;
	private String street;
	private String city;
	private String nearBy;
	private String State;
	private Integer pin;

	public AddressCommand() {
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

	public void setPin(Integer pin) {
		this.pin = pin;
	}
}
