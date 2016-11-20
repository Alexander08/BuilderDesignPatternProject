package com.holiday.domain.builder;

import java.util.Calendar;

import com.holiday.domain.cristmass.CristmassBalls;
import com.holiday.domain.cristmass.CristmassTree;
import com.holiday.domain.easter.EasterBunny;
import com.holiday.domain.easter.EasterEggs;
import com.holiday.domain.easter.EasterMeal;
import com.holiday.domain.specialevents.Festival;
import com.holiday.domain.specialevents.Games;
import com.holiday.domain.specialevents.Parades;

public class OrganizeHolidayBuilder {

	public OrganizeHoliday prepareCritmass() {

		Calendar date = Calendar.getInstance();
		date.set(Calendar.MONTH, Calendar.DECEMBER);
		date.set(Calendar.DAY_OF_MONTH, 25);
		
		OrganizeHoliday holiday = new OrganizeHoliday();
		holiday.addHolidayEvent(new CristmassBalls());
		holiday.addHolidayEvent(new CristmassTree());
		holiday.addHolidayEvent(new Parades(date.getTime()));
		holiday.addHolidayEvent(new Games(date.getTime()));
		
		return holiday;
	}
	
	public OrganizeHoliday prepareEaster() {

		Calendar date = Calendar.getInstance();
		date.set(Calendar.MONTH, Calendar.APRIL);
		date.set(Calendar.DAY_OF_MONTH, 20);
		
		OrganizeHoliday holiday = new OrganizeHoliday();
		holiday.addHolidayEvent(new EasterEggs());
		holiday.addHolidayEvent(new EasterBunny());
		holiday.addHolidayEvent(new EasterMeal());
		holiday.addHolidayEvent(new Parades(date.getTime()));
		holiday.addHolidayEvent(new Games(date.getTime()));
		holiday.addHolidayEvent(new Festival(date.getTime()));
		
		return holiday;
	}
}
