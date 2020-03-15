package com.devdojo.polimorfismo;

public class Gerente extends Funcionario{

	private double pNL;
	
	public Gerente(String nome, double salario, double pNL) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
		this.pNL = pNL;
		
	}

	public double getpNL() {
		return pNL;
	}

	public void setpNL(double pNL) {
		this.pNL = pNL;
	}

	@Override
	public void calcularPagamento() {
		// TODO Auto-generated method stub
		this.salario = this.salario + pNL;
		
	}
	
}
