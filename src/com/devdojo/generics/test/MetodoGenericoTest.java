package com.devdojo.generics.test;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {

	public static void main(String[] args) {
		
		List<Cachorro> cachorroList = criarArrayRetorno(new Cachorro());
		System.out.println(cachorroList);

	}

	public static <T> void criarArray(T t) {

		List<T> lista = new ArrayList<T>();

		lista.add(t);
		System.out.println(lista);

	}

	public static <T extends Animal> List<T> criarArrayRetorno(T t) {

		List<T> lista = new ArrayList<T>();

		lista.add(t);
		System.out.println(lista);
		return lista;

	}

}
