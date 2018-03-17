package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4235588409979331384L;
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * title
	 */
	private String title;
	private Date dob;
	
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	

}
