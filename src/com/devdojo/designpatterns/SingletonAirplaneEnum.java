package com.devdojo.designpatterns;

import java.util.HashSet;
import java.util.Set;

public enum SingletonAirplaneEnum {
	
	//melhor forma
	INSTANCE;
	private Set<String> assentosDisponiveis;
	
	SingletonAirplaneEnum() {
		// TODO Auto-generated constructor stub
	
		this.assentosDisponiveis = new HashSet<String>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
		
	}
	
	public boolean bookAssento(String assento) {
		// TODO Auto-generated method stub
		return assentosDisponiveis.remove(assento);

	}
	
	public static void agendarAssento(String assento) {

		SingletonAirplaneEnum a = SingletonAirplaneEnum.INSTANCE;
		a.bookAssento(assento);

	}

}
