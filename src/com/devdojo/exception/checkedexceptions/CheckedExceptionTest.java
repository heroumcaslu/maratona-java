package com.devdojo.exception.checkedexceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {

		try {

			criarArquivo();

		} catch (IOException e) {
			// TODO: handle exception
			e.getMessage();

		}

	}

	public static void criarArquivo() throws IOException {

		File f = new File("teste.txt");

		try {

			// Metodo retorna um booleano.
			f.createNewFile();
			System.out.println("Arquivo criado com sucesso!");

		} catch (IOException e) {

			// e.printStackTrace();
			e.getMessage();
			throw e;
		}

	}
	
	public static String abrirArquivo() throws IOException {

		try {

			System.out.println("Abrindo um arquivo");
			System.out.println("Lendo um arquivo");
			//throw new Exception();
			System.out.println("Escrevendo no arquivo");
			//System.out.println("Fechar o arquivo");
			return "valor";

		} catch (Exception e) {

			// e.printStackTrace();
			e.getMessage();
			
		} finally {
			
			System.out.println("Fechar o arquivo");
			
		}
		return null;

	}

}
