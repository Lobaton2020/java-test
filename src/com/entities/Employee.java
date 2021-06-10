package com.entities;

public class Employee extends Persona{
	
	private String road;
	private float salary;


	public Employee(
			String name,
			String lastname,
			String dateBirth,
			String gender,
			String identification,
			String road,
			float salary
	) {
		super(identification,name,gender,lastname,dateBirth);
		this.road = road;
		this.salary = salary; 

	}
	
	public String getRoad() {
		return road;
	}

	public float getSalary() {
		return salary;
	}
	@Override
	protected String getIdentification() {
		return super.getIdentification();
	}
	@Override
	protected String getNamePerson() {
		return super.getNamePerson();
	}
	@Override
	protected String getGender() {
		return super.getGender();
	}
	@Override
	public String getLastname() {
		return super.getLastname();
	}
	@Override
	public String getDateBirth() {
		return super.getDateBirth();
	}
	
}
