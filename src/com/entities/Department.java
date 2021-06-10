package com.entities;

import java.util.ArrayList;

public class Department {
	private String name;
	private Employee director;
	private ArrayList<Employee> employess = new ArrayList<Employee>();
  
	public Department(String name, Employee director) {
		super();
		this.name = name;
		this.director = director;
	}

	public boolean addEmployee(Employee employes) {
		return employess.add(employes);
	}
	
	
	public String getName() {
		return name;
	}

	public Employee getDirector() {
		return director;
	}

	public ArrayList<Employee> getEmployess() {
		return employess;
	}
}
