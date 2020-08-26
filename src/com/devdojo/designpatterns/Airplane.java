package com.devdojo.designpatterns;

import java.util.HashSet;
import java.util.Set;

public class Airplane {
	
	private Set<String> assentosDisponiveis;
	
	
	public Airplane() {
		// TODO Auto-generated constructor stub
		this.assentosDisponiveis = new HashSet<String>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
		
	}
	
	public boolean bookAssento(String assento) {
		// TODO Auto-generated method stub
		return assentosDisponiveis.remove(assento);

	}

}
