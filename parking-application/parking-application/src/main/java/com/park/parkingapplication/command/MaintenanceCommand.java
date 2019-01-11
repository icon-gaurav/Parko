/**
 * 
 */
package com.park.parkingapplication.command;

/**
 * @author Gaurav Kumar
 *
 */
public class MaintenanceCommand {
	private String id;
	private Long responseTime;
	private Boolean doorstep;
	private Double rate;
	private Integer rating;

	public MaintenanceCommand() {
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
