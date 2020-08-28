package com.devdojo.lambdas.interfaces;

import com.devdojo.lambdas.Carro;

//Interface que tem apenas um método
@FunctionalInterface
public interface CarroPredicate {
	
	boolean test(Carro carro);

}
