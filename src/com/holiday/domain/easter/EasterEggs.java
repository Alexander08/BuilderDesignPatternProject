package com.holiday.domain.easter;

public class EasterEggs extends Easter{

	public EasterEggs() {
		this.price = 12599.9F;
	}
	
	@Override
	public String name() {
		return "Put Easter Eggs everywhere";
	}

	@Override
	public float price() {
		return price;
	}
}
