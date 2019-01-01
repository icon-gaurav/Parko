/**
 * 
 */
package com.park.parkingapplication.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Gaurav Kumar
 *
 */

@Entity
public class Company {
	@Id
	private String id;
	private String name;
	@OneToOne
	private Address address;
	@Enumerated
	private Category category;
	@Enumerated
	private Status status;
	private byte[] description;
	private Time openTime;
	private Time closeTime;

	public Company() {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

}
