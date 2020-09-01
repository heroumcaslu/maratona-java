package com.devdojo.optional.classes;

import java.util.Optional;

public class Seguradora {
	
	private String nome;
	
	public Seguradora() {
		// TODO Auto-generated constructor stub
	}
	
	public Seguradora(String nome) {
		
		this.nome = nome;
		
	}
	
	//Se não poder ser nulo
	public String getNome() {
		return nome;
	}
	
	//Se poder ser nulo
	/*public Optional<String> getNome() {
		
		return Optional.ofNullable(nome);
		
	}*/

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Seguradora [nome=" + nome + "]";
	}
	
}
