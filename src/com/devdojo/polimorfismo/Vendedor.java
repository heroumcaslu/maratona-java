package com.devdojo.polimorfismo;

public class Vendedor extends Funcionario {

	private double totalVendas;
	
	public Vendedor(String nome, double salario, double totalVendas) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
		this.totalVendas = totalVendas;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public void calcularPagamento() {
		// TODO Auto-generated method stub
		this.salario = this.salario + (totalVendas*0.05);
		
	}
	
	

}
