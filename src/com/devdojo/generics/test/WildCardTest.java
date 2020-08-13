package com.devdojo.generics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
	
	public abstract void consulta();
	
}

class Cachorro extends Animal implements Comparable<String> {

	@Override
	public void consulta() {
		// TODO Auto-generated method stub
		System.out.println("Consultando Cachorro");
		
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Gato extends Animal {

	@Override
	public void consulta() {
		// TODO Auto-generated method stub
		System.out.println("Consultando Gato");
		
	}
	
}

public class WildCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
		consultarAnimais(cachorros);
		//consultarAnimais(gatos);
		
		List<Cachorro> dogList = new ArrayList<Cachorro>();
		List<Gato> catList = new ArrayList<Gato>();
		
		dogList.add(new Cachorro());
		catList.add(new Gato());
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		consultarAnimaisList(animalList);
		ordenarLista(dogList);

	}
	
	public static void consultarAnimais(Animal[] animals) {
		
		for(Animal animal: animals) {
			
			animal.consulta();
			
		}
		//ArrayStoryException
		animals[1] = new Gato();
		
	}
	
	//type erasure | ?
	public static void consultarAnimaisList(List<? extends Animal> animals) {
		
		for(Animal animal : animals) {
			
			animal.consulta();
			
		}
		//animals.add(new Cachorro());
		//animals.add(new Gato());
		
	}
	
	public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
		
		cachorroList.add(new Cachorro());
		//cachorroList.add(new Animal());
		
	}
	
	public static void ordenarLista(List<? extends Comparable> lista) {
		
		Collections.sort(lista);
		
	}

}
