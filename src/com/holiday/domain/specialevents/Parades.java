package com.holiday.domain.specialevents;

import java.util.Calendar;
import java.util.Date;

/**
 * Just for fun, make like a return of a parade with Cristmass or Ester try to
 * use a simple in-Build factory
 */
public class Parades extends SpecialEvents {

	public Parades(Date date) {
		
		this.dateForSpecialEvent = date;
		this.message = "Lets make a parade for ";
		
		Calendar xmassDate = Calendar.getInstance();
		
		xmassDate.set(Calendar.MONTH, Calendar.DECEMBER);
		xmassDate.set(Calendar.DAY_OF_MONTH, 26);

		Calendar startEvent = (Calendar) xmassDate.clone();
		startEvent.set(Calendar.DAY_OF_MONTH, 1);
		if (this.dateForSpecialEvent.before(xmassDate.getTime())
				&& this.dateForSpecialEvent.after(startEvent.getTime())) {
			
			this.message += "Cristmass";
			this.price = 10000.0f;
		} else {
			
			this.message += "Easter";
			this.price = 8999.9f;
		}
	}
	@Override
	public String name() {

		return this.message;
	}

	@Override
	public float price() {
		return this.price;
	}

}
