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

}
