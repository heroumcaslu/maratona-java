package com.devdojo.generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lista = new ArrayList<String>();
		lista.add("String");
		lista.add("String");
		lista.add("Lucas");
		//add(lista, 1L);
		
		//Erro em tempo de compilação por causa do long na lista
		for(String obj : lista) {
			
			System.out.println(obj);
			
		}
		add(lista, 1L);

	}
	
	public static void add(List lista, Long l) {
		
		lista.add(l);
		
	}

}
