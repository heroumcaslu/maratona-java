package com.devdojo.streams.classes;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double salario;
	
	public Pessoa(String nome, int idade, double salario) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	
	}
	
	public static List<Pessoa> bancoDePessoas() {
		
		return Arrays.asList(new Pessoa("William Suane", 22, 2000), 
				new Pessoa("William Suane", 22, 2000),
				new Pessoa("Mercy", 28, 2200),
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
	
	

}
