package com.devdojo.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
	
	public static void main(String[] args) {
		
		//ISO-639 PT, BR, US, EN
		Locale locale = new Locale("pt", "br");
		Locale usa = new Locale("en", "us");
		
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(df.format(c.getTime()));
		
		System.out.println(locale.getDisplayLanguage());
		//Mostra portuguese
		System.out.println(locale.getDisplayLanguage(usa));
		//portugues
		System.out.println(locale.getDisplayLanguage(locale));
		
		System.out.println(locale.getDisplayCountry());
				
	}

}
