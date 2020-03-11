package com.devdojo.classes.heranca;

//extends Object
public class Pessoa {

	//protected
	private String name;
	private String cpf;
	private Endereco endereco;
	
	public void print() {
		
		System.out.println(this.name+" "+this.cpf+" "+this.endereco);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
