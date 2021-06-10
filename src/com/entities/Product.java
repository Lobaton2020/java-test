package com.entities;

public class Product {
	private String name;
	private int amount;
	private Float unitValue;

	public Product(String name, int amount, Float unitValue) {
		super();
		this.name = name;
		this.amount = amount;
		this.unitValue = unitValue;
	}

	public Float getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(Float unitValue) {
		this.unitValue = unitValue;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}
}
