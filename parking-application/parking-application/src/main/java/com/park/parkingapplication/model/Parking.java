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
public class Parking {
	@Id
	private String id;
	private Double area;
	private Integer carCapacity;
	private Integer bikeCapacity;
	private Integer heavyVehicleCapacity;
	private Integer available;
	private Double rent;
	@Max(5)
	private Integer rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Integer getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(Integer carCapacity) {
		this.carCapacity = carCapacity;
	}

	public Integer getBikeCapacity() {
		return bikeCapacity;
	}

	public void setBikeCapacity(Integer bikeCapacity) {
		this.bikeCapacity = bikeCapacity;
	}

	public Integer getHeavyVehicleCapacity() {
		return heavyVehicleCapacity;
	}

	public void setHeavyVehicleCapacity(Integer heavyVehicleCapacity) {
		this.heavyVehicleCapacity = heavyVehicleCapacity;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Parking() {
		super();
	}

}
