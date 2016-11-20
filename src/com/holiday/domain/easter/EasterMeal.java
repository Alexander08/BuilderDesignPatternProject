package com.holiday.domain.easter;

public class EasterMeal extends Easter {

	public EasterMeal() {
		this.price = 9999.9f;
	}

	@Override
	public String name() {
		return "Cook drob and lamb for everyone";
	}

	@Override
	public float price() {
		return this.price;
	}
}
