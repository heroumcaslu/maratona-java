package com.devdojo.lambdas.test;

import com.devdojo.lambdas.Carro;
import com.devdojo.lambdas.interfaces.CarroPredicate;

public class LambdaTest {

	// Foi criado para diminuir a verbosidade
	// anonima - função - passada - concisa
	// Só é possivel utilizar com interface funcionaljjj
	// Parametro -> corpo
	// (Carro carro) -> carro.getCor().equals("verde");
	// (String s) -> s.length();
	// (int a, int b)-> sout(a+b)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarroPredicate carroPredicate = new CarroPredicate() {
			
			@Override
			public boolean test(Carro carro) {
				// TODO Auto-generated method stub
				return carro.getCor().equals("verde");
			}
		};
		
		//Com lambda
		CarroPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
		
		System.out.println(carroPredicate.test(new Carro("verde", 2012)));
		System.out.println(carroPredicate.test(new Carro("verde", 2012)));
		
		Runnable runnable = () -> System.out.println("Dentro do runa");
		
		new Thread(runnable).run();

	}

}
