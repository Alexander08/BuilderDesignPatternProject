package com.holiday.domain.cristmass;

public class CristmassLights extends Cristmass {

	public CristmassLights() {

		this.price = 25000.0f;
	}
	
	@Override
	public String name() {
		return "Put Cristmass Lights everywhere";
	}

	@Override
	public float price() {
		
		return this.price;
	}

}
