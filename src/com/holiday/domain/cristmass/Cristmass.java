package com.holiday.domain.cristmass;

import com.holiday.domain.Holiday;
import com.holiday.domain.getthemreal.GetThemReal;
import com.holiday.domain.getthemreal.Redecorate;

public abstract class Cristmass implements Holiday {

	protected float price;
	
	@Override
	public GetThemReal getThemReal() {

		return new Redecorate();
	}

	@Override
	public abstract String name();

	@Override
	public abstract float price();
	
}
