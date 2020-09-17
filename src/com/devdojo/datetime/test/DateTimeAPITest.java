package com.devdojo.datetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class DateTimeAPITest {
	
	public static void main(String[] args) {
		
		System.out.println(new Date());
		
		System.out.println(Calendar.getInstance());
		
		//Trabalhar somente com datas
		LocalDate date = LocalDate.of(2017, Month.FEBRUARY, 15);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear());
		
		System.out.println(date.get(ChronoField.YEAR));
		
		LocalDate now = LocalDate.now();
		
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		
		System.out.println("------ LocalTime ---------");
		
		LocalTime time = LocalTime.of(23, 2, 15);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		
		System.out.println("------ Parsing ---------");
		
		LocalDate.parse("2017-02-15");
		LocalTime.parse("15:25:10");
		
		System.out.println("------ LocalDateTime ---------");
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2017, 8, 6, 8, 35, 33);
		LocalDateTime ldt3 = date.atTime(10, 20, 20);
		LocalDateTime ldt4 = date.atTime(LocalTime.now());
		LocalDateTime ldt5 = date.atTime(time);
		//só aceita um date
		LocalDateTime ldt6 = time.atDate(date);
		LocalDateTime ldt7 = time.atDate(LocalDate.now());
		
	}

}
