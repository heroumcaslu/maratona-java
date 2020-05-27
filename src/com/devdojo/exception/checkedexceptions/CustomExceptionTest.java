package com.devdojo.exception.checkedexceptions;

import com.devdojo.exception.customexception.InvalidLoginException;

public class CustomExceptionTest {

	public static void main(String[] args) {
		
		try {
			logar();
		} catch (InvalidLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void logar() throws InvalidLoginException {
		
		String usuarioDB = "123";
		String senhaDB = "111";
		String usuarioDigitado = "goku";
		String senhaDigitada = "123";
		if(!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
			
			throw new InvalidLoginException();
			
		} else {
			
			System.out.println("Login válido!");
			
		}
		
	}
	
}
