package com.devdojo.exception.customexception;

public class InvalidLoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidLoginException() {
		
		super("Usuário ou senha inválidos");
		
	}
	
}
