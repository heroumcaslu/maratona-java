package com.devdojo.datetime.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import com.devdojo.datetime.util.DateUtil;

public class DateTimeAPITest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfWeek());
		//proximo ou mesmo
		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
	
		date = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		
		date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
		date = date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
		
		date = date.with(TemporalAdjusters.firstDayOfMonth());
		date = date.with(TemporalAdjusters.lastDayOfMonth());
		
		date = date.with(TemporalAdjusters.firstDayOfNextYear());
		date.getDayOfWeek();
		
		date = date.with(new DateUtil());
		
		date = date.plusDays(3);
		

	}

}
