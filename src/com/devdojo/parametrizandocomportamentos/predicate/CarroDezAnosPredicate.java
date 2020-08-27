package com.devdojo.parametrizandocomportamentos.predicate;

import java.util.Calendar;

import com.devdojo.parametrizandocomportamentos.Carro;
import com.devdojo.parametrizandocomportamentos.interfaces.CarroPredicate;

public class CarroDezAnosPredicate implements CarroPredicate {

	@Override
	public boolean test(Carro carro) {
		// TODO Auto-generated method stub
		return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR)-10);
	}
	
	

}
