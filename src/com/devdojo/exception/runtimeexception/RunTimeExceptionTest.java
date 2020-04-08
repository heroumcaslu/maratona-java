package com.devdojo.exception.runtimeexception;

public class RunTimeExceptionTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Object o = null;
		int a = 10;
		int b = 0;

		// Checked - Compilador espera tratamento antes de compilar
		// Unchecked - Não precisa de tratamento antes de compilar (Runtime exceptions)

		// Erros em tempo de execução são causados pela logica do programador
		if (a != 0 && b != 0) {

			System.out.println(a / b);

		} else {

			System.out.println("Zero encontrado, certifique-se que os números são diferentes de zero.");

		}
		// null pointer exception
		System.out.println(o.toString());

		int[] arr = new int[2];

		try {

			System.out.println(arr[2]);

		} catch (RuntimeException e) {

			//Trabalhar com a classe mais específica possível, pois a classe pode conter informações importantes sobre o erro.
			e.printStackTrace();
			// System.out.println(e.getMessage());

		}
		System.out.println("Com o try o código continua funcionando.");

	}
	
	private static void divisao(double num, double num2) {
		if(num == 0|| num2 == 0) {
			
			throw new IllegalArgumentException("Passe um valor diferente de zero");
			
		}
		double result = num/num2;
		System.out.println(result);
		
	}

}
