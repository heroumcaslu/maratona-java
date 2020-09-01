package com.devdojo.optional.classes;

import java.util.Optional;

public class Pessoa {

	private Carro carro;
	private String nome;
	
	public Pessoa(Carro carro, String nome) {
		// TODO Auto-generated constructor stub
		this.carro = carro;
		this.nome = nome;
	}
	
	public Pessoa(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}

	public Optional<Carro> getCarro() {
		return Optional.ofNullable(carro);
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
