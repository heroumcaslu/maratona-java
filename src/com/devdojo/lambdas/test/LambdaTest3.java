package com.devdojo.lambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.devdojo.lambdas.Carro;
import com.devdojo.lambdas.ComparadorCarro;

public class LambdaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method references
		forEach(Arrays.asList("William", "Devdojo", "Alou"), System.out::println);
		List<Carro> carros = Arrays.asList(new Carro("Vermelho", 1999), new Carro("Azyk", 2005),
				new Carro("Preto", 1985));

		Collections.sort(carros, (o1, o2) -> o1.getCor().compareTo(o2.getCor()));
		// Reference to a static method
		Collections.sort(carros, ComparadorCarro::compareByColor);

		// Reference to an instance method of a particular object
		ComparadorCarro comparadorCarro = new ComparadorCarro();

		Collections.sort(carros, comparadorCarro::compareByYear);

		// Reference to an instance method of an arbitrary object of a particular type
		List<String> nome = Arrays.asList("Lucas", "Ana", "Breno");
		nome.sort((s1, s2) -> s1.compareTo(s2));
		nome.sort(String::compareTo);

		Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
		Function<String, Integer> stringToInteger2 = Integer::parseInt;
		System.out.println(stringToInteger2.apply("10"));

		BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
		BiPredicate<List<String>, String> contains2 = List::contains;
		contains2.test(nome, "Lucas");

		// Reference to a constructors
		Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
		// System.out.println(comparadorCarroSupplier.get().compareByYear(c1, c2));
		ComparadorCarro comparadorCarro2 = new ComparadorCarro();

		Collections.sort(carros, comparadorCarroSupplier.get()::compareByYear);
		
		BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s,i);
		BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
		System.out.println(carroBiFunction.apply("rosa", 1994));
		
		

	}

	public static <T> void forEach(List<T> list, Consumer<T> c) {

		for (T e : list) {

			c.accept(e);

		}

	}

	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {

		List<R> result = new ArrayList<R>();
		for (T e : list) {

			result.add(f.apply(e));

		}
		return result;

	}

}
