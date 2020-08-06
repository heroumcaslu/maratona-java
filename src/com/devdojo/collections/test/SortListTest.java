package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = new ArrayList<String>();
		nomes.add("Lucas");
		nomes.add("Silva");
		nomes.add("DevDojo");
		nomes.add("William");
		nomes.add("Brenon");
		nomes.add("Bruno");
		nomes.add(0, "Anna");
		
		//Classe utilitária Collections
		Collections.sort(nomes);
		
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(1.5);
		numeros.add(1.9);
		numeros.add(1.6);
		numeros.add(2d);
		
		Collections.sort(numeros);
		
		for(Double num : numeros) {
			
			System.out.println(num);
			
		}
		
		for(String nome : nomes) {
			
			System.out.println(nome);
			
		}

	}

}
