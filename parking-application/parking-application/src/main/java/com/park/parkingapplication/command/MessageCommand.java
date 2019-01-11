/**
 * 
 */
package com.park.parkingapplication.command;

/**
 * @author Gaurav Kumar
 *
 */
public class MessageCommand {
	private String id;
	private String name;
	private String email;
	private String subject;
	private byte[] content;

	public MessageCommand() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] message) {
		this.content = message;
	}

}
