package com.devdojo.classesabstratas;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String CLT, double salario) {
		super(nome, CLT, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSalario() {
		
		this.salario = salario + (salario*0.2);
		
	}
	
}
