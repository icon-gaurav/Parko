/**
 * 
 */
package com.park.parkingapplication.command;

import java.sql.Time;
import java.util.Arrays;
import java.util.Set;

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
	private Set<Category> category;
	private Status status;
	private byte[] description;
	private Time openTime;
	private Time closeTime;

	public Time getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		Time time;
		if (openTime.lastIndexOf(':') > 2)
			time = Time.valueOf(openTime);
		else
			time = Time.valueOf(openTime + ":00");
		this.openTime = time;
	}

	public Time getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		Time time;
		if (closeTime.lastIndexOf(':') > 2)
			time = Time.valueOf(closeTime);
		else
			time = Time.valueOf(closeTime + ":00");
		this.closeTime = time;
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

	public Set<Category> getCategory() {
		return category;
	}

	public void setCategory(Set<Category> category) {
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

	@Override
	public String toString() {
		return "CompanyCommand [id=" + id + ", name=" + name + ", addressCommand=" + addressCommand + ", category="
				+ category + ", status=" + status + ", description=" + Arrays.toString(description) + ", openTime="
				+ openTime + ", closeTime=" + closeTime + "]";
	}

}
