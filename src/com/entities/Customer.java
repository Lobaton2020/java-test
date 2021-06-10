package com.entities;
import java.util.ArrayList;
public class Customer extends Persona{

	private ArrayList<Payment> payments = new ArrayList<Payment>();

	public Customer(
			String name,
			String lastname,
			String dateBirth,
			String gender,
			String identification
	) {
		super(identification,name,gender,lastname,dateBirth);			
	}

	public boolean addPay(Payment pay) {
		return this.payments.add(pay);
	}
	
	
}
