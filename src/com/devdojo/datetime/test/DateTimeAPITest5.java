package com.devdojo.datetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeAPITest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		String s4 = "20170221";
		String s5 = "2017-02-21";
		
		LocalDate parse = LocalDate.parse(s4, DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 = LocalDate.parse(s5, DateTimeFormatter.ISO_DATE);
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		String s6 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		
		LocalDateTime parse3 = LocalDateTime.parse("2017-02-21T13:07:40.433");
		
		//Formatos
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate.now().format(formatter);
		
		LocalDate parse4 = LocalDate.parse("01/02/2017", formatter);
		
		DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
		LocalDate.now().format(fr);
		
		LocalDate parse5 = LocalDate.parse("12.févries.2017", fr);
		

	}

}
