package com.devdojo.modificadorestatico;

public class Customer {

	//0 - Bloco de inicialização estático será executado na sua primeira ocorrência na JVM será executado apenas uma vez
	//1 - Primeiro é alocado espaço na memória para o objeto
	//2 - Cada atributo é criado com os valores default ou explicitados
	//3 - Bloco de inicialização é executado
	//4 - Construtor é executado
	private static int[] installments = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
	
	//Bloco de inicialização (deve ser criado antes do construtor, pórem não importa onde você crie ele será executado antes).
	//também pode ser estático e será executado apenas uma vez. basta adicionar static
	{
		
		installments = new int[100];
		System.out.println("Bloco de inicialização");
		for(int i = 1; i <=100; i++) {
			
			installments[i-1] = i;
			
		}
		
	}
	
	public Customer() {
		
		System.out.println("Construtor");
		
	}

	public static int[] getInstallments() {
		return installments;
	}

	public static void setInstallments(int[] installments) {
		Customer.installments = installments;
	}

}
