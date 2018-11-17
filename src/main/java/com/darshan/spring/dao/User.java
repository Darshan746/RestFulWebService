package com.darshan.spring.dao;

import java.sql.Date;

import javax.validation.constraints.Size;

public class User {
	
	private Integer id;
	@Size(message="name lenght should be greater than 2",min=2)
	private String name;
	private Date dateOfBirth;
	public Integer getId() {
		return id;
	}
	
	
	protected User() {
		
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public User(int id, String name, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
