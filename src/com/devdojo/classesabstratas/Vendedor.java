package com.devdojo.classesabstratas;

public class Vendedor extends Funcionario {

	//O vendedor ganha 5% reais por cada venda
	private double totalVendas;
	
	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		this.salario = salario + (totalVendas*0.5);
		
	}

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nome, String CLT, double salario, double totalVendas) {
		super(nome, CLT, salario);
		// TODO Auto-generated constructor stub
		this.totalVendas = totalVendas;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	

}
