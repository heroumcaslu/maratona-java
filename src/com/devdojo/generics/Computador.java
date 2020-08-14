package com.devdojo.generics;

public class Computador {
	
	private String nome;
	
	public Computador(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

	@Override
	public String toString() {
		return "Computador [nome=" + nome + "]";
	}

}
