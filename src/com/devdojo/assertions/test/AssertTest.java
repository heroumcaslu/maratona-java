package com.devdojo.assertions.test;

public class AssertTest {
	
	public static void main(String[] args) {
		
		double salario = 10000;
		calculaSalario(salario );
		calculSalario(salario);
		
	}
	
	private static void calculaSalario(double salario) {
		// TODO Auto-generated method stub
		//Precisam ser habilitadas
		assert (salario > 0): "Mensagem"; //Tem que ser true! deve ser utilizado em métodos privados.

		//é possível colocar um método na mensagem desde que tenha retorno.
		
	}
	
	public static void calculSalario(double salario) {
		
		if(salario < 0) {
			
			throw new IllegalArgumentException();
			
		}
		
	}

}
