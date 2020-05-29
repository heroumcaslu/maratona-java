package com.devdojo.strings.tests;

public class StringPerformanceTest {

	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();
		concatString(1000000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		concatStringBuilder(1000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

	}

	private static void concatString(int tamanho) {
		
		@SuppressWarnings("unused")
		String string = "";
		for (int i = 0; i < tamanho; i++) {

			string += 1;

		}

	}

	private static void concatStringBuilder(int tamanho) {

		//Melhor performance de todos
		StringBuilder sb = new StringBuilder(tamanho);
		for (int i = 0; i < tamanho; i++) {

			sb.append(1);

		}
 
	}
	
	@SuppressWarnings("unused")
	private static void concatStringBuffer(int tamanho) {

		StringBuffer sb = new StringBuffer(tamanho);
		for (int i = 0; i < tamanho; i++) {

			sb.append(1);

		}

	}

}
