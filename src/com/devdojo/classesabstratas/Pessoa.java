package com.devdojo.classesabstratas;

public abstract class Pessoa {
	
	protected String nome;
	
	//Deve ser sobrescrito na primeira classe concreta.
	//Pode ser sobrescrito em outra classe abstrata.
	//public abstract void imprime(); 
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

}
