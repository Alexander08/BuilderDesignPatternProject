package com.holiday.domain.builder;

import java.util.ArrayList;
import java.util.List;

import com.holiday.domain.Holiday;

public class OrganizeHoliday {

	private List<Holiday> holidayList = new ArrayList<Holiday>();
	private float totalCost;

	public void addHolidayEvent(Holiday holiday) {
		this.holidayList.add(holiday);
	}

	public float getTotalCost() {
		
		for (Holiday h : holidayList) {
			this.totalCost += h.price();
		}
		return this.totalCost;
	}
	public void showListOfEventsForHoliday(){
		
		for (Holiday h : holidayList) {
			System.out.println("Product: " + h.name());
			System.out.println("Realisation Process: " + h.getThemReal().workHard());
			System.out.println("Price: " + h.price());
			System.out.println("--------");
		}
	}
}
