package com.entities;

import java.util.ArrayList;

public class Payment {

	private ArrayList<Product> products = new  ArrayList<Product>();
	private Customer customer;
	
	private String datePay;
	private float  total;
	private float  impost;
	private float  netvalue;
	
	public Payment(Customer customer, String datePay, Float netvalue) {
		super();
		this.customer = customer;
		this.datePay = datePay;
		this.netvalue = netvalue;
	}

	public boolean addProduct(Product product) {
		return this.products.add(product);
	}
	
	public float getValueTotalProducts() {
		float total = 0;
		for(Product product:products) {
			total += product.getUnitValue();
		}
		return total;
	}
	public float getValueImposts() {
		// No se especifica valor del impuesto, lo asumire con el 19 % del valor de cada producto.
		float total = 0;
		float porcentImpost = (float)23.19;
		
		for(Product product:products) {
			total += product.getUnitValue() * porcentImpost;
		}
		return total;
	}
	
	public float getNetValueProducts() {
		float netPay = this.getValueTotalProducts() - getValueImposts();
		return this.netvalue = netPay;
		
	}

	public Customer getCustomer() {
		return customer;
	}
	
	
}
