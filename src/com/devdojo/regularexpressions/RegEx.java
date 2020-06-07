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
		String regex = "ab";
		//Não reutiliza caracteres já utilizados, por exemplo aba em abababa encontra a posição 0 e 4
		String txt = "abaaaabaaabaaab";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(txt);
		System.out.println("texto:  "+txt);
		System.out.println("indice: 0123456789");
		System.out.println("expressão: "+matcher.pattern());
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			
			System.out.println(matcher.start()+" ");
			
		}
		
	}
}
