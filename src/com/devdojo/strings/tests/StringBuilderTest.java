package com.devdojo.strings.tests;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String s = "Uma frase comum";
		//String Builder e StringBuffer são as mesmas classes a diferença é que um é syncronized (Buffer)
		//Tamanho padrão 16 caracteres
		StringBuilder sb = new StringBuilder(10);
		s.concat("teste");
		sb.append(1);
		
		//Inverter string
		sb.reverse();
		
		//Deletar caracteres, funciona da mesma forma que o substring
		sb.delete(0, 2);
		
		//Inserir
		sb.insert(0, "aaa");
		
	}

}
