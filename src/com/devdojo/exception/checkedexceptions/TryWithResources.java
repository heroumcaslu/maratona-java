package com.devdojo.exception.checkedexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.devdojo.exception.checkedexceptions.classes.Leitor1;
import com.devdojo.exception.checkedexceptions.classes.Leitor2;

public class TryWithResources {

	public static void main(String[] args) {

	}

	public static void readFileJava6() {

		Reader reader = null;
		try {

			reader = new BufferedReader(new FileReader("text.tx"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			try {

				if (reader != null) {

					reader.close();

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}

	}

	public static void readFile() {

		//Requer uma classe que implemente autoclosable
		try(Reader reader = new BufferedReader(new FileReader("text.tx"))) {

			System.out.println("try with resources");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
	public static void readFileDois() {

		//Requer uma classe que implemente autoclosable
		//fecha na ordem inversa da declaração.
		try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

			System.out.println("try with resources");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
