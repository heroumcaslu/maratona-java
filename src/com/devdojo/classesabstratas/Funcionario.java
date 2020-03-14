package com.devdojo.classesabstratas;

public abstract class Funcionario extends Pessoa {

	protected String CLT;
	protected double salario;
	
	public Funcionario() {
		
		//Default constructor.
		
	}
	
	public Funcionario(String nome, String CLT, double salario) {
		
		this.nome = nome;
		this.CLT = CLT;
		this.salario = salario;
		
	}
	
	//Abstract method.
	public abstract void calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCLT() {
		return CLT;
	}

	public void setCLT(String cLT) {
		CLT = cLT;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", CLT=" + CLT + ", salario=" + salario + "]";
	}
	
	

}
