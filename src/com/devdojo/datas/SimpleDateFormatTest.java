package com.devdojo.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//Data personalizada
		//O que tá entre aspas simples não é convertido.
		String mask = "yyyy.MM.dd G 'at' HH:mm:ss z";
		SimpleDateFormat format = new SimpleDateFormat(mask);
		System.out.println(format.format(c.getTime()));
		
		
	}

}
