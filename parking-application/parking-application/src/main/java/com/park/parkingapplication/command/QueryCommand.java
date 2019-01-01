/**
 * 
 */
package com.park.parkingapplication.command;

/**
 * @author Gaurav Kumar
 *
 */
public class QueryCommand {
	private String id;
	private String value;

	public QueryCommand() {
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
