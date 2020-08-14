package com.devdojo.generics;

import java.util.Comparator;

public class Carro implements Comparable<Carro> {

	private String nome;

	public Carro(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + "]";
	}

	@Override
	public int compareTo(Carro o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
