package com.holiday.domain.specialevents;

import java.util.Calendar;
import java.util.Date;

public class Games extends SpecialEvents {

	public Games(Date date) {

		this.dateForSpecialEvent = date;
		this.message = "Play ";

		Calendar xmassDate = Calendar.getInstance();

		xmassDate.set(Calendar.MONTH, Calendar.DECEMBER);
		xmassDate.set(Calendar.DAY_OF_MONTH, 26);

		Calendar startEvent = (Calendar) xmassDate.clone();
		startEvent.set(Calendar.DAY_OF_MONTH, 1);
		if (this.dateForSpecialEvent.before(xmassDate.getTime())
				&& this.dateForSpecialEvent.after(startEvent.getTime())) {

			this.message += "Jessus Birth 2.0 with 10 friends or play Irod where you try to kill Jessus";
			this.price = 13200.0f;
		} else {

			this.message += "Crucifix your saivior and win the competition";
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
