package com.devdojo.apresentacao;

public class EstruturasDeRepeticao {
	
	public static void main(String[] args) {
	
		//break = for, while, do-while e switch
		//cria uma variável; condição; incremento
		for(int i = 0; i < 100; i++) {
			
			System.out.println("Execução "+i);
			
		}
		
		//Só executa quando for true
		int x = 1;
		while(x < 1) {
			
			System.out.println("Exexução while"+x);
			x++;
			
		}
		
		//executa pelo menos uma vez
		int y = 1;
		do {
			
			System.out.println("Executando do "+y);
			
		} while (y < 1);
		
	}

}
