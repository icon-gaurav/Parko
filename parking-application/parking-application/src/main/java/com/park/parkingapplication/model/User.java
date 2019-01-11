/**
 * 
 */
package com.park.parkingapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Gaurav Kumar
 *
 */
@Entity
public class User {
	@Id
	private String username;
	private String password;
	private String email;
	private Boolean isActive;
}
