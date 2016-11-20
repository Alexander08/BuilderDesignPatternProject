package com.holiday.domain.cristmass;

public class CristmassMeal extends Cristmass{

	public CristmassMeal() {
		this.price = 7500.0f;
	}
	
	@Override
	public String name() {
		return "Cook sarmale everywhere";
	}

	@Override
	public float price() {
		return price;
	}

}
