package com.devdojo.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		
		//Pattern, matcher
		// \d - Digitos numéricos
		// \D - o que nao for digito numerico
		// \s - Espaços em branco (\t \n \f \r)
		// \S - caractere que não é branco
		// \w - procura por caracteres de palavras a-z, A-Z, 0-9 e underline
		// \W - não é caractere de palavra
		//String regex = "\\d";
		//String regex = "[a-zABC]"; //Procura por esses caracteres
		//[] - range
		//quantificadores
		// ? zero ou uma
		// * zero ou mais
		// + uma ou mais
		// {n, m} n até m ocorrencias
		// () - agrupar
		// | - ou
		// $ - fim da linha
		// ^ - negação - inicio
		// . CORINGA
		// o(v|c)o
		@SuppressWarnings("unused")
		int hex = 0x100; //hexadecimal
		//String regex = "0[xX]([0-9a-fA-f])+(\\s|$)";
		//String regex = "ab";
		//Não reutiliza caracteres já utilizados, por exemplo aba em abababa encontra a posição 0 e 4
		//String txt = "abaaaabaaabaaab";
		
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String txt = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.br teate@mail";
		//String regex = "proj([^,])";
		//String txt = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.br teate@mail";
		
		//String regex = "\\d{2}/\\d{2}/\\d{2,4};
		//String txt = "01/01/2020";
		
		
		System.out.println("#@!abrao@mail.br".matches(regex));
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(txt);
		System.out.println("texto:  "+txt);
		System.out.println("indice: 0123456789");
		System.out.println("expressão: "+matcher.pattern());
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			
			System.out.println(matcher.start()+" "+matcher.group());
			
		}
		
	}
}
