package com.devdojo.optional.test;

import java.util.Optional;

import com.devdojo.optional.classes.Carro;
import com.devdojo.optional.classes.Pessoa;
import com.devdojo.optional.classes.Seguradora;

public class OptionalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seguradora s = new Seguradora("Alo vc");
		System.out.println(obterNomeSeguradoraOptional(s));
		
		//
		Carro carro = new Carro(s, "Audi");
		Pessoa p = new Pessoa(carro, "Carlos");
		
		getNomeSeguradora(Optional.ofNullable(p));
		

	}
	
	public static String getNomeSeguradora(Optional<Pessoa> pessoa) {
		
		return pessoa.flatMap(Pessoa::getCarro)
				.flatMap(Carro::getSeguradora)
				.map(Seguradora::getNome).orElse("Não existe");
		
	}
	
	public static String obterNomeSeguradoraOptional(Seguradora seguradora) {
		
		
		System.out.println(Optional.ofNullable(seguradora).map(Seguradora::getNome));
		//System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome).orElse("vazio"));
		
		return "";
		
	}
	
	private static String obterNomeSeguradora(Seguradora seguradora) {
		
		String nome = null;
		if(seguradora.getNome() != null) {
			
	//		nome = seguradora.getNome();
			
		}
		
		return nome;
		
	}

}
