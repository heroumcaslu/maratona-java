package com.devdojo.controledefluxo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break
		double totalAmount = 30000;
		for (int installments = 1; installments < totalAmount; installments++) {

			//vai pular a iteração quando a parcela for 1
			if (installments == 1) {

				continue;

			}

			double installmentValue = totalAmount / installments;
			if (installmentValue >= 1000 && installments >= 2) {

				System.out.println("O valor da parcela em " + installments + " vezes é: " + installmentValue);

			} else {

				// Para a execução do código.
				break;

			}

		}

		// continue

		for (int installments = 1; installments < totalAmount; installments++) {

			double installmentValue = totalAmount / installments;
			if (installmentValue < 1000 && installments == 2) {

				continue;

			} else {

				// Imprime o valor da parcela caso o valor for maior ou igual a 1000.
				System.out.println("O valor da parcela em " + installments + " vezes é: " + installmentValue);

			}

		}

	}

}
