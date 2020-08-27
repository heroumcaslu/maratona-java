package com.devdojo.parametrizandocomportamentos.predicate;

import com.devdojo.parametrizandocomportamentos.Carro;
import com.devdojo.parametrizandocomportamentos.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

	@Override
	public boolean test(Carro carro) {
		// TODO Auto-generated method stub
		return carro.getCor().equals("verde");
	}

}
