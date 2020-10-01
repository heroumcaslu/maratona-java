package com.devdojo.classes;

public class Calculadora {

	int result;

	void somaArray(int[] numbers) {

		for (int num : numbers) {

			this.result += num;

		}
		System.out.println(this.result);

	}

	// Além de passar arrays, posso passar valores separados por virgula.
	void somaVarArgs(int... numbers) {

		for (int num : numbers) {

			this.result += num;

		}
		System.out.println(this.result);

	}

	double divisao(int num1, int num2) {

		if (num2 != 0) {
			return num1 / num2;
		}
		return 0;

	}
	
	void divisaoVoid(int num1, int num2) {

		if (num2 != 0) {
			System.out.println(num1 / num2);
			return;
		}
		System.out.println("Não é possível dividir por zero!");

	}

}
