package com.devdojo.classes.sobrecarga;

public class Employee {
	
	private String name;
	private String cpf;
	private String rg;
	private double salario;
	
	public Employee() {
		
		
		
	}
	
	//Sobrecarga
	public Employee(String name) {
		
		this.name = name;
		
	}
	
	public Employee(String name, String cpf, String rg, double salario) {
		
		//Um construtor só pode ser chamado dentrode outro construtor na primeira linha.
		this(name);
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
		
	}
	
	public void init(String name, double salario, String cpf) {
		
		this.name = name;
		this.salario = salario;
		this.cpf = cpf;
		
	}
	
	//Sobrecarga
	public void init(String name, double salario, String cpf, String rg) {
		
		init(name, salario, cpf);
		this.rg = rg;
		
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
