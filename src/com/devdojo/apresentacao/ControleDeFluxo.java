package com.devdojo.apresentacao;

public class ControleDeFluxo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 20;

		if(idade > 16) {
			
			//executa uma ação
			System.out.println("Entrou pro clube");
			
		} else if(idade == 15) {
			
			//executa uma outra ação
			System.out.println("Pode fazer a inscrição");
			
		} else {
			
			//executa uma ação caso não entre em nenhuma condição anterior
			System.out.println("Não pode entrar no clube");
			
		}
		
		//Operador ternário
		String status = idade > 16 ? "True ENTROU" : "False Não pode entrar";
		//Operações mais complicadas
		String status2 = idade > 16 ? "True ENTROU" : idade == 15 ? "pode fazer a inscrição" : "Não pode entrar no clube";
		
		int opcao = 1;
		
		switch (opcao) {
		
			case 0:
				System.out.println("Menu 0");
				break;
			case 1:
				System.out.println("Menu 1");
				break;
			case 2:
				System.out.println("Menu 2");
				break;
			default:
				System.out.println("Selecione uma opção");
				break;
		
		}
		
	}

}
