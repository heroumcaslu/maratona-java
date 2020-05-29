package com.devdojo.datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		float valor = 123.4567f;
		Locale japan = new Locale("jp");
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(japan);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(japan);
		for(NumberFormat nf : nfa) {
			
			System.out.println(nf.format(valor));
			
		}
		
		//Digitos após o ponto/virgula, o padrão são 3
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(valor));
		
		String valorString = "123.4567";
		try {
			System.out.println(nf.parse(valorString));
			//Desconsidera os números decimais.
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse(valorString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
