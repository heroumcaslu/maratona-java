package com.devdojo.classesinternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.devdojo.generics.Carro;

class Animal {
	
	public void andar() {
		
		System.out.println("Andando");
		
	}
	
}

public class ClassesAnonimasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal() {
			
			public void andar() {
				
				System.out.println("Andando anonimamente");
				
			}
			//não consegue referenciar novos métodos
			
		};
		a.andar();
		
		List<Carro> carList = new ArrayList<Carro>();
		
		carList.add(new Carro("BMW"));
		carList.add(new Carro("Mercedes"));
		
		Collections.sort(carList, new Comparator<Carro>() {

			@Override
			public int compare(Carro o1, Carro o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareTo(o2.getNome());
			}
		
		});
		//lambda
		//Collections.sort(carList, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));

	}

}

class CarroComparator implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {
		// TODO Auto-generated method stub
		return o1.getNome().compareTo(o2.getNome());
	}
	
	
	
}
