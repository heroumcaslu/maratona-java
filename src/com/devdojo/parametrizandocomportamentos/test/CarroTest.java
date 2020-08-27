package com.devdojo.parametrizandocomportamentos.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import com.devdojo.parametrizandocomportamentos.Carro;
import com.devdojo.parametrizandocomportamentos.interfaces.CarroPredicate;
import com.devdojo.parametrizandocomportamentos.predicate.CarrosCorVerdePredicate;

public class CarroTest {

	private static List<Carro> filtrarCarroVerde(List<Carro> carros) {

		List<Carro> result = new ArrayList<Carro>();
		for (Carro carro : carros) {

			if (carro.getCor().equals("verde"))
				;
			result.add(carro);

		}
		return result;

	}

	private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {

		List<Carro> result = new ArrayList<Carro>();
		for (Carro carro : carros) {

			if (carro.getCor().equals(cor))
				;
			;
			result.add(carro);

		}
		return result;

	}

	private static List<Carro> filtrarCarroPorDezAnos(List<Carro> carros, String cor) {

		List<Carro> result = new ArrayList<Carro>();
		for (Carro carro : carros) {

			if (carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10))
				;
			result.add(carro);

		}
		return result;

	}

	private static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {

		List<Carro> result = new ArrayList<Carro>();
		for (Carro carro : carros) {

			if (carroPredicate.test(carro)) {

				result.add(carro);

			}
		}
		return result;

	}

	public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {

		List<T> result = new ArrayList<T>();
		for (T e : list) {

			if (predicate.test(e)) {

				result.add(e);

			}
		}
		return result;

	}

	public static void main(String[] args) {

		List<Carro> carros = Arrays.asList(new Carro("vermelho", 2020), new Carro("preto", 2017),
				new Carro("verde", 1995));

		// System.out.println(filtrarCarroVerde(carros));
		System.out.println(filtrarCarros(carros, new CarrosCorVerdePredicate()));
		System.out.println(filtrarCarros(carros, new CarroPredicate() {

			@Override
			public boolean test(Carro carro) {
				// TODO Auto-generated method stub
				return carro.getCor().equals("verde");
			}
		}));

		System.out.println(filtrar(carros, new Predicate<Carro>() {

			@Override
			public boolean test(Carro carro) {
				// TODO Auto-generated method stub
				return carro.getCor().equals("verde");
			}
		}));

	}

}
