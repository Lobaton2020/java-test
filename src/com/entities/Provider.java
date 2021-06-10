package com.entities;

import java.util.ArrayList;

public class Provider extends Persona{
	
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public Provider(
			String name,
			String lastname,
			String dateBirth,
			String gender,
			String identification
	) {
		super(identification,name,gender,lastname,dateBirth);			
	}
	
	public boolean addProduct(Product product) {
		return this.products.add(product);
	}
}
