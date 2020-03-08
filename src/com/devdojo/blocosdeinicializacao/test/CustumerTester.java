package com.devdojo.blocosdeinicializacao.test;

import com.devdojo.blocosdeinicializacao.Customer;

public class CustumerTester {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		System.out.println("Exibindo a quantidade de parcelas possíveis");
		
		for(int installment : c.getInstallments()) {
			
			System.out.print(installment+" ");
			
		}
		
	}
	
}
