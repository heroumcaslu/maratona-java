package com.devdojo.classes.heranca.test;

import com.devdojo.classes.heranca.Endereco;
import com.devdojo.classes.heranca.Pessoa;

public class TestaHeranca {

	public static void main(String[] args) {
		
		Pessoa person = new Pessoa();
		
		person.setName("Lucas");
		Endereco end = new Endereco();
		end.setBairro("barro");
		end.setRua("Rua 21 de Abril");
		person.setEndereco(end);
		person.setCpf("70170393437");
		
	}
	
}
