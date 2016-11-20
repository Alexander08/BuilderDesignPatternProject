package com.holiday.domain.specialevents;

import java.util.Calendar;
import java.util.Date;

public class Festival extends SpecialEvents {

	public Festival(Date date) {

		this.dateForSpecialEvent = date;
		this.message = "Come to ";

		Calendar xmassDate = Calendar.getInstance();

		xmassDate.set(Calendar.MONTH, Calendar.DECEMBER);
		xmassDate.set(Calendar.DAY_OF_MONTH, 26);

		Calendar startEvent = (Calendar) xmassDate.clone();
		startEvent.set(Calendar.DAY_OF_MONTH, 1);
		if (this.dateForSpecialEvent.before(xmassDate.getTime())
				&& this.dateForSpecialEvent.after(startEvent.getTime())) {

			this.message += "play with little Jessus and watch macig show";
			this.price = 13200.0f;
		} else {

			this.message += "Rebirth of Jessus and Reggae music, tickets looks like a dread";
			this.price = 18999.9f;
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
