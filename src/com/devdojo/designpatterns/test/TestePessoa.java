package com.devdojo.designpatterns.test;

import com.devdojo.designpatterns.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Padrão Builder
		Pessoa p = new Pessoa.PessoaBuilder("Lucas")
				.name("Lucas")
				.nick("heroumcaslu")
				.lastName("Silva")
				.middleName("Herom")
				.father("Pai de Lucas")
				.createPerson();
		
	}

}
