package com.sip.ams.forms;


public class PersonForm {
	
	private String firstName;
	private String lastName;
	
	public PersonForm(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PersonForm() {
		
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
