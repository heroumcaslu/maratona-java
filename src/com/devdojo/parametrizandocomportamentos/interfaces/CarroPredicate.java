package com.devdojo.parametrizandocomportamentos.interfaces;

import com.devdojo.parametrizandocomportamentos.Carro;

//Interface que tem apenas um método
@FunctionalInterface
public interface CarroPredicate {
	
	boolean test(Carro carro);

}
