package com.devdojo.streams.classes;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double salario;
	private Genero genero;
	
	public Pessoa(String nome, int idade, double salario) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	
	}
	
	public Pessoa(String nome, int idade, double salario, Genero genero) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.genero = genero;
	
	}
	
	public static List<Pessoa> bancoDePessoas() {
		
		return Arrays.asList(new Pessoa("William Suane", 22, 2000), 
				new Pessoa("William Suane", 22, 2000),
				new Pessoa("Mercy", 22, 2200),
				new Pessoa("Mercy", 22, 2200),
				new Pessoa("Ana", 19, 1895),
				new Pessoa("Thor", 23, 1980),
				new Pessoa("Hulk", 35, 8000),
				new Pessoa("Flash", 29, 3200),
				new Pessoa("Batman", 37, 10000),
				new Pessoa("Lanterna Verde", 24, 5000));
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	
	

}
