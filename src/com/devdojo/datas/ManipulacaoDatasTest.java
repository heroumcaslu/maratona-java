package com.devdojo.datas;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDatasTest {
	
	public static void main(String[] args) {
		//Date(deprecated) -> Calendar -> Time(package)
		Date date = new Date(1000000000000L);
		date.setTime(date.getTime() + 3_600_0000L);
		System.out.println(date);
		
		//Calendar (Abstrata, suporte a internacionalização)
		Calendar c = Calendar.getInstance();
		//Código legado
		c.setTime(date);
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			
			System.out.println("Sim, domingo é o primeiro dia da semana.");
			
		}
		//Imprime o valor do dia da semana
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//Imprime o valor do dia do mês
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//Imprime o valor do dia do ano
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		//Vira o dia ou ano
		c.add(Calendar.HOUR, 24);
		c.add(Calendar.MONDAY, 9);
		
		//Não vira o dia nem o ano
		c.roll(Calendar.HOUR, 24);
		c.roll(Calendar.MONDAY, 9);
		
		//Imprime a data
		Date date2 = c.getTime();
		System.out.println(date2);
		
		//NumberFormat, Locale, Calendar, Date, DateFormat. Para trabalhar com numeros datas e moedas.
		
	}

}
