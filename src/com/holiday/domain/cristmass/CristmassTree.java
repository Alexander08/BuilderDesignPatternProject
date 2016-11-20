package com.holiday.domain.cristmass;

public class CristmassTree extends Cristmass {

	public CristmassTree() {
		this.price = 20000.0f;
	}
	
	@Override
	public String name() {

		return "Put Cristmass Tree everywhere";
	}

	@Override
	public float price() {

		return this.price;
	}

}
