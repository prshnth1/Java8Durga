package com.durgaSoft.section7.lecture91;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		ZoneId myZone = ZoneId.systemDefault();
		System.out.println(myZone);

		ZoneId laZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime laTime = ZonedDateTime.now(laZone);
		System.out.println(laTime);

		/* To get the list of all time zone */

		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for (String zone : zoneIds) {
			System.out.println(zone);
		}

	}
}
