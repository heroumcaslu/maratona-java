package com.devdojo.blocosdeinicializacao;

public class Customer {

	//1 - Primeiro é alocado espaço na memória para o objeto
	//2 - Cada atributo é criado com os valores default ou explicitados
	//3 - Bloco de inicialização é executado
	//4 - Construtor é executado
	private int[] installments = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
	
	//Bloco de inicialização (deve ser criado antes do construtor, pórem não importa onde você crie ele será executado antes).
	{
		
		System.out.println("Bloco de inicialização");
		
	}
	
	public Customer() {
		
		System.out.println("Construtor");
		
	}

	public int[] getInstallments() {
		return installments;
	}

	public void setInstallments(int[] installments) {
		this.installments = installments;
	}

}
