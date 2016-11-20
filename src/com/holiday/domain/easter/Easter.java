package com.holiday.domain.easter;

import com.holiday.domain.Holiday;
import com.holiday.domain.getthemreal.GetThemReal;
import com.holiday.domain.getthemreal.Redecorate;

public abstract class Easter implements Holiday{

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
