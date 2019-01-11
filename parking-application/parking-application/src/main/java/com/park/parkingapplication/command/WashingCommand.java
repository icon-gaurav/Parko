/**
 * 
 */
package com.park.parkingapplication.command;

/**
 * @author Gaurav Kumar
 *
 */
public class WashingCommand {
	private String id;
	private Integer capacity;
	private Double area;
	private Double rate;
	private Integer rating;

	public WashingCommand() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
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
