package com.devdojo.generics.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.generics.Carro;

public class ClasseGenericaTest {

	public static void main(String[] args) {

		List<Carro> carrosDisponiveis = new ArrayList<Carro>();

		carrosDisponiveis.add(new Carro("gol"));
		carrosDisponiveis.add(new Carro("BMW"));
		
		ObjetoAlugavel<Carro> rentableCar = new ObjetoAlugavel<Carro>(carrosDisponiveis);
		
		Carro car = rentableCar.getObjetoDisponivel();
		System.out.println("Usando carro por um mês");
		rentableCar.devolverObjeto(car);

	}

}

class ObjetoAlugavel<T> {

	private List<T> objDisponiveis = new ArrayList<T>();

	public ObjetoAlugavel(List<T> objetosDisponiveis) {

		this.objDisponiveis = objetosDisponiveis;

	}

	public T getObjetoDisponivel() {

		T obj = objDisponiveis.remove(0);
		System.out.println("Alugando carro: " + obj);
		return obj;

	}

	public void devolverObjeto(T obj) {

		System.out.println("Devolver obj: " + obj);
		objDisponiveis.add(obj);
		System.out.println("Objetos disponiveis: " + objDisponiveis);

	}

}

class DoisAtributos<T, X> {
	
	T um;
	X dois;
	
	public DoisAtributos(T um, X dois) {
		super();
		this.um = um;
		this.dois = dois;
	}
	
	public T getUm() {
		return um;
	}
	public void setUm(T um) {
		this.um = um;
	}
	public X getDois() {
		return dois;
	}
	public void setDois(X dois) {
		this.dois = dois;
	}
	
}
