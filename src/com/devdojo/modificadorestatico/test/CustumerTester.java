package com.devdojo.modificadorestatico.test;

import com.devdojo.modificadorestatico.Customer;

public class CustumerTester {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Customer c = new Customer();
		
		System.out.println("Exibindo a quantidade de parcelas possíveis");
		
		for(int installment : Customer.getInstallments()) {
			
			System.out.print(installment+" ");
			
		}
		
		System.out.println(Customer.getInstallments().length);
		
	}
	
}
