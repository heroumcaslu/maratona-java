package com.devdojo.datetime.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class DateTimeAPITest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ZonedDateTime
		//ZoneId

		for(Map.Entry<String, String> zonas : ZoneId.SHORT_IDS.entrySet()) {
			
			System.out.println(zonas.getKey()+" "+zonas.getValue());
			
		}
		
		System.out.println(ZoneId.systemDefault());
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		ZonedDateTime zonedDateTime = dateTime.atZone(tokyo);
		System.out.println(zonedDateTime);
		
		Instant instant = Instant.now();
		instant.atZone(tokyo);
		
		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);
		
		ZoneOffset manaus = ZoneOffset.of("-04:00");
		
		LocalDateTime dateTime2 = LocalDateTime.now();
		OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime2, manaus);
		OffsetDateTime offsetDateTime2 = dateTime2.atOffset(manaus);
		
		Instant instant2 = Instant.now();
		System.out.println(instant2.atOffset(manaus));
		
		JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
		System.out.println(japaneseDate);
		
		LocalDate antigamente = LocalDate.of(1900, 2, 1);
		System.out.println(JapaneseDate.from(antigamente));
		
	}

}
