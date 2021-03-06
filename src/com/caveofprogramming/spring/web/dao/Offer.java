package com.caveofprogramming.spring.web.dao;

import javax.validation.constraints.*;

import com.caveofprogramming.spring.web.validation.ValidEmail;

public class Offer {

	private int id;
	
	@Size(min=4, max=100, message="Name length must be between 4 and 100 characters.")
	private String name;
	
	@NotNull
	//@Pattern(regexp=".*\\@.*\\..*", message="This does not appear to be a valid email address.")
	@ValidEmail(min=6, message="This does not appear to be a valid email address.")
	private String email;
	
	@Size(min=20, max=250, message="Text length must be between 20 and 250 characters.")
	private String text;

	public Offer() {
		
	}
	
	public Offer(String name, String email, String text) {
		this.name = name;
		this.email = email;
		this.text = text;
	}

	
	public Offer(int id, String name, String email, String text) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}

}
