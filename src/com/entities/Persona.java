package com.entities;

abstract public class Persona {
	private String identification;
	private String name;
	private String gender;
	private String lastname;
	private String dateBirth;
	
	protected Persona(String identification, String name, String gender, String lastname, String dateBirth) {
		super();
		this.identification = identification;
		this.name = name;
		this.gender = gender;
		this.lastname = lastname;
		this.dateBirth = dateBirth;
	}

	protected String getIdentification() {
		return identification;
	}

	protected String getNamePerson() {
		return name;
	}

	protected String getGender() {
		return gender;
	}

	protected String getLastname() {
		return lastname;
	}

	protected String getDateBirth() {
		return dateBirth;
	}
}
