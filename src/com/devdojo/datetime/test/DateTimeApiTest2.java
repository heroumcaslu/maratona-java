package com.devdojo.datetime.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApiTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Date().getTime(); //miliseconds
		Instant instant = Instant.now(); // Ponto no tempo em nano segundos
		
		System.out.println(instant);//ZULU
		
		System.out.println(LocalDateTime.now());
		//T separadata e hora Z zulu time(UTC)
		
		System.out.println(instant.getEpochSecond());
		System.out.println(instant.getNano());
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(3, 0));
		System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
		System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
		System.out.println("---------DURATION---------");
		
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(2017, 1, 1, 23, 0, 0);
		
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(5, 0,0);// 5AM
		
		//Não pode usar LocalDate
		//Não pode misturar LocalDateTime com LocalTime
		Duration d1 = Duration.between(dt1, dt2);
		Duration d2 = Duration.between(time1, time2);
		Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
		//Duration d4 = Duration.between(dt2, time2);
		//Duration d5 = Duration.between(LocalDate.now(), LocalDate.now().plusDays(20));
		Duration d6 = Duration.between(dt2, time2.atDate(dt2.toLocalDate()));
		Duration d7 = Duration.ofMinutes(3);
		Duration d8 = Duration.ofDays(10);
		Duration d9 = Duration.of(3, ChronoUnit.SECONDS);//não é aconselhável
		
		
		System.out.println(d1);
		
		System.out.println("---------PERIOD---------");
		
		Period p1 = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
		Period p2 = Period.ofDays(10);
		Period p3 = Period.ofWeeks(58);
		Period p4 = Period.ofYears(3);
		System.out.println(p1);
	//	System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths());
		LocalDateTime now = LocalDateTime.now();
		now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS);
		
		System.out.println("---------CHRONOUNIT---------");
		
		LocalDateTime aniversario = LocalDateTime.of(1975, 8, 23, 12, 0, 0);
		ChronoUnit.DAYS.between(aniversario, now);
		ChronoUnit.WEEKS.between(aniversario, now);
		ChronoUnit.MONTHS.between(aniversario, now);
		ChronoUnit.YEARS.between(aniversario, now);

	}

}
