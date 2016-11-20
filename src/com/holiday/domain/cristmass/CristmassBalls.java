package com.holiday.domain.cristmass;

public class CristmassBalls extends Cristmass {

	public CristmassBalls() {
		this.price = 10000.0f;
	}
	
	@Override
	public String name() {
		
		return "Put Cristmass Balls everywhere";
	}

	@Override
	public float price() {
		return this.price;
	}

}
