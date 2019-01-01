/**
 * 
 */
package com.park.parkingapplication.model;

import org.springframework.stereotype.Component;

/**
 * @author Gaurav Kumar
 *
 */
@Component
public class Query {
	private String id;
	private String value;

	public Query() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
