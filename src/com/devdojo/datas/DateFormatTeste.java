package com.devdojo.datas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		DateFormat[] date = new DateFormat[6];
		date[0] = DateFormat.getInstance();
		date[1] = DateFormat.getDateInstance();
		date[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		date[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		date[4] = DateFormat.getDateInstance(DateFormat.LONG);
		date[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat df : date) {
			
			System.out.println(df.format(c.getTime()));
			
		}
		
		
	}

}
