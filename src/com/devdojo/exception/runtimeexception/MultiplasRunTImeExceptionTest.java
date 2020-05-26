package com.devdojo.exception.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRunTImeExceptionTest {
	
	public static void main(String[] args) {
		try {
			
			//Ele executa esse código somente se nenhuma exceção for encontrada.
			System.out.println("Isso que é chamado de tratamento de múltiplas exceções.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Index out of bound");
			//Mais especifica primeiro (se tratando de herança).
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			
			System.out.println("Illegal Argument");
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException");
			
		} catch (RuntimeException e) {
			
			//Respeita a hierarquia (a classe mais generica por último), para não gerar um unchecked exception.
			System.out.println("Runtime exception");
			//Mais genérica por último (se tratando de herança).
			
		}
		System.out.println("Fim do código");
		
		try {
			
			talvezLanceException();
			
		} catch(SQLException e) {
			
			e.getMessage();
			
		} catch(IOException e) {
			
			e.getMessage();
			
		}
		
	}
	private static void talvezLanceException() throws SQLException, FileNotFoundException {
		
		
		
	}

}
