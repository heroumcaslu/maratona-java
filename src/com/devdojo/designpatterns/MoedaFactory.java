package com.devdojo.designpatterns;

public class MoedaFactory {
	
	public static Moeda criarMoeda(Country country) {
		
		if(country.equals(country.BRAZIL)) {
			
			return new Real();
			
		} else if(country.equals(country.BRAZIL)) {
			
			return new USDollar();
			
		}
		
		throw new IllegalArgumentException();
		
	}

}
