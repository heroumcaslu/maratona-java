package com.devdojo.designpatterns;

import java.util.HashSet;
import java.util.Set;

public class SingletonAirplane {

	//EAGER INITIALIZATION
	//private static final SingletonAirplane INSTANCE = new SingletonAirplane();
	//LAZY
	private static SingletonAirplane INSTANCE = new SingletonAirplane();
	private Set<String> assentosDisponiveis;
	
	//EAGER
	/*
	public static SingletonAirplane getInstance() {
		return INSTANCE;
	}*/
	
	//LAZY
	/*public static SingletonAirplane getInstance() {
		if(INSTANCE == null) {
		
			INSTANCE = new SingletonAirplane();
		
		}
		return INSTANCE;
	}*/
	/* THREAD SAFE
	public static synchronized SingletonAirplane getInstance() {
		if(INSTANCE == null) {
		
			INSTANCE = new SingletonAirplane();
		
		}
		return INSTANCE;
	}*/
	
	//THREAD SAFE
	public static SingletonAirplane getInstance() {
		if(INSTANCE == null) {
			synchronized (SingletonAirplane.class) {
				
				if(INSTANCE == null) {
					
					INSTANCE = new SingletonAirplane();
					
				}
				
			}
			
		
		}
		return INSTANCE;
	}
	
	private SingletonAirplane() {
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
