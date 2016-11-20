package com.holiday.domain.specialevents;

import java.util.Date;

import com.holiday.domain.Holiday;
import com.holiday.domain.getthemreal.GetThemReal;
import com.holiday.domain.getthemreal.PutInScene;

public abstract class SpecialEvents implements Holiday {

	protected float price;
	protected Date dateForSpecialEvent;
	protected String message;

	@Override
	public GetThemReal getThemReal() {

		return new PutInScene();
	}

	@Override
	public abstract String name();

	@Override
	public abstract float price();
}
