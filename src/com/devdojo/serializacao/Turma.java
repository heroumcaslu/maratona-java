package com.devdojo.serializacao;

import java.io.Serializable;

public class Turma implements Serializable {

	private String nome;

	public Turma(String nome) {
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
		return "Turma [nome=" + nome + "]";
	}
	
	
	
}
