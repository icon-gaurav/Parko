/**
 * 
 */
package com.park.parkingapplication.command;

import java.sql.Time;

import com.park.parkingapplication.model.Category;
import com.park.parkingapplication.model.Status;

/**
 * @author Gaurav Kumar
 *
 */
public class CompanyCommand {
	private String id;
	private String name;
	private AddressCommand addressCommand;
	private Category category;
	private Status status;
	private byte[] description;
	private Time openTime;
	private Time closeTime;

	public Time getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Time openTime) {
		this.openTime = openTime;
	}

	public Time getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Time closeTime) {
		this.closeTime = closeTime;
	}

	public CompanyCommand() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressCommand getAddressCommand() {
		return addressCommand;
	}

	public void setAddressCommand(AddressCommand addressCommand) {
		this.addressCommand = addressCommand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public byte[] getDescription() {
		return description;
	}

	public void setDescription(byte[] description) {
		this.description = description;
	}

}
