package com.devdojo.strings.tests;

public class StringTest {

	public static void main(String[] args) {
		//Strings são imutáveis
		String nome = "Lucas";//1 - Variável de referência 2 - String na pool de string
		String sobrenome = new String("Herom");//1 - Variável de referência 2 - String na pool de string 3 - Objeto do tipo string
		nome = nome.concat("Alou");//Cria uma nova String em memória e atribui à variavel nome.
		//System.out.println(nome+" "+sobrenome);
		
		String teste = "Goku";
		String teste2 = "goku";
		System.out.println(teste.charAt(0));
		System.out.println(teste2.equals(teste));//retorna false
		System.out.println(teste.equalsIgnoreCase(teste2));//retorna true
		System.out.println(teste.length());//Retorna o tamanho da string
		System.out.println(teste.replace('o', 'a'));
		System.out.println(teste.toUpperCase());
		System.out.println(teste.toLowerCase());
		System.out.println(teste.substring(3));//
		System.out.println(teste.substring(1, 2));
		System.out.println(sobrenome.trim());//remove os espaços do começo e do fim.
		
		
	}
	
}
