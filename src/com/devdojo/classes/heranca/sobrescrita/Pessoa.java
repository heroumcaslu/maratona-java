package com.devdojo.classes.heranca.sobrescrita;

public class Pessoa {

	private String name;
	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + "]";
	}

}
