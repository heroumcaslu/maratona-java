package com.devdojo.datetime.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTimeAPITest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manipular atributos de forma relativa
		LocalDate localDate = LocalDate.of(2017, Month.FEBRUARY, 25);//thread safe and imutable
		System.out.println(localDate);
		LocalDate withYear = localDate.withYear(2020);
		localDate = localDate.withMonth(Month.AUGUST.getValue());
		localDate = localDate.withDayOfMonth(10);
		localDate = localDate.with(ChronoField.DAY_OF_MONTH, 15);
		
		localDate = localDate.plusMonths(2);
		localDate = localDate.plusMonths(5);
		localDate = localDate.plus(2, ChronoUnit.MONTHS);
		
		localDate = localDate.plusMonths(2).minusDays(20).plusMonths(1);
		
		LocalTime time = LocalTime.now();
		time = time.withHour(10);
		time = time.plusHours(5).minusMinutes(30);
		time = time.with(ChronoField.HOUR_OF_DAY, 10);
		time = time.plus(2, ChronoUnit.HOURS);
		

	}

}
