/**
 * 
 */
package com.park.parkingapplication.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

/**
 * @author Gaurav Kumar
 *
 */
@Entity
public class Customer {
	@Id
	private String userName;
	private String vehicleNum;
	private Date regDate;
	private Boolean isRegCustomer;
	private String contact;
	private String email;

	public Customer() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Boolean getIsRegCustomer() {
		return isRegCustomer;
	}

	public void setIsRegCustomer(Boolean isRegCustomer) {
		this.isRegCustomer = isRegCustomer;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
