package com.devdojo.optional.test;

import java.util.Optional;

public class OptionalTest1 {
	
	private String nome;
	public static void main(String[] args) {
		
		OptionalTest1 ot = new OptionalTest1();
		if(ot.nome !=  null) {
			
			System.out.println(ot.nome.toUpperCase());
		
		}
		
		//Com optional
		//Certeza que não é nulo
		Optional<String> optional1 = Optional.of(ot.nome);
		Optional<String> optional2 = Optional.empty();
		//Pode ser nulo
		Optional<String> optional3 = Optional.ofNullable(ot.nome);
		
		
		//Buscando valores
		System.out.println(optional1.orElse("vazio"));
		if(optional2.isPresent()) {
			System.out.println(optional2.get());//erro se for nulo
		}
		
	}

}
