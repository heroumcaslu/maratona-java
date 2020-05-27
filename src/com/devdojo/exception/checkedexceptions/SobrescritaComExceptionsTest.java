package com.devdojo.exception.checkedexceptions;

import java.io.FileNotFoundException;

import com.devdojo.exception.checkedexceptions.classes.Funcionario;
import com.devdojo.exception.checkedexceptions.classes.Pessoa;
import com.devdojo.exception.customexception.InvalidLoginException;

public class SobrescritaComExceptionsTest {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Pessoa p = new Pessoa();
		
		try {
			//O método na classe pessoa lança exceção já na classe Funcionario não
			//pela possibilidade do código mudar totalmente e não lançar exceção em funcionario
			//é permitido chamar o método de funcionario sem tratar a exceção.
			p.salvar();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//se eu quiser lançar apenas uma ou as duas exceçoes de pessoa ou uma classe filha ou runtime em funcionário é possível.
		f.salvar();
		
	}
	
}
