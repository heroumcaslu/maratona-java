package com.devdojo.classes.heranca;

public class Funcionario extends Pessoa{

	private double salario;
	
	public Funcionario() {
		
		super();
		
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void print() {
		
		//super.print();
		System.out.println(super.getName()+super.getCpf()+super.getEndereco());
		
	}
	
	public void printPaycheck() {
		
		System.out.println("Eu "+super.getName());
		
	}
	
}
