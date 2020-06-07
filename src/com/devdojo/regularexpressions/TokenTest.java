package com.devdojo.regularexpressions;

public class TokenTest {
	
	public static void main(String[] args) {
		//Os nomes são os tokens e a virgula é o delimiter.
		String str = "william, paulo, joana, camila, ana, john, Mateus";
		
		String[] names = str.split(", ");
		
		for(String name : names) {
			
			System.out.println(name);
			
		}
		
	}

}
