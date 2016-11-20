package com.holiday.domain.easter;

public class EasterBunny extends Easter{

	public EasterBunny() {
		this.price = 35999.9f;
	}
	
	@Override
	public String name() {
		return "Convince Easter Bunny to come in town";
	}

	@Override
	public float price() {
		return this.price;
	}
}
