/**
 * 
 */
package com.park.parkingapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

/**
 * @author Gaurav Kumar
 *
 */
@Entity
public class Maintenance {
	@Id
	private String id;
	private Long responseTime;
	private Boolean doorstep;
	private Double rate;
	@Max(5)
	private Integer rating;

	public Maintenance() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}

	public Boolean getDoorstep() {
		return doorstep;
	}

	public void setDoorstep(Boolean doorstep) {
		this.doorstep = doorstep;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
