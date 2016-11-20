package com.holiday.domain.main;

import com.holiday.domain.builder.OrganizeHoliday;
import com.holiday.domain.builder.OrganizeHolidayBuilder;

public class Main {

	public static void main(String[] args) {
		
		OrganizeHolidayBuilder ohb = new OrganizeHolidayBuilder();
		System.out.println("Cristmass preparation: ");
		OrganizeHoliday holiday = ohb.prepareCritmass();
		holiday.showListOfEventsForHoliday();
		System.out.println("Total Cost for this Cristmass: " + holiday.getTotalCost() + " euros");
		
		System.out.println("========================");
		System.out.println("\n Easter preparation");
		holiday = ohb.prepareEaster();
		holiday.showListOfEventsForHoliday();
		System.out.println("Total Cost for this Easter: " + holiday.getTotalCost() + " euros");
	}
}
