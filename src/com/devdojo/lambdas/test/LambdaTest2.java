package com.devdojo.lambdas.test;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.devdojo.lambdas.Carro;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forEach(Arrays.asList("William", "Devdojo", "Alou"), (String s) -> System.out.println(s));
		
		List<Integer> list = map(Arrays.asList("William", "Devdojo", "Alou"), (String s) -> s.length());
		System.out.println(list);
		
		List<String> listCores = map(Arrays.asList(new Carro("Preto", 2011), new Carro("Preto", 2011)), (Carro c) -> c.getCor());
		System.out.println(listCores);
		
		Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
		System.out.println(pares.test(1000));
		
		IntPredicate impar = (int i) -> i % 2 == 1;
		System.out.println(impar.test(1000));
		
		//Variaveis locais dentro de um lambda
		//Mesma regra pra classe anonima
		//Precisa ser final ou efetivamente final
		String cor = "VERMELHO";
		
		//TargetType
		Callable<Integer> c = () -> 100;
		PrivilegedAction<Integer> p = () -> 100;
		
		Predicate<String> p1 = (String s) -> listCores.add(s);
		p1.test("amarelo");
		
		//Statement expression
		Consumer<String> b = (String s) -> listCores.add(s);
		b.accept("amarelo");
		
		//Removendo tipo do parametro
		Consumer<String> b1 = s -> listCores.add(cor);
		b.accept("amarelo");
		
		Supplier<String> str = () -> "oi";
		Supplier<Carro> car = () -> new Carro("Preto", 2011);
		System.out.println(car.get().getAno());

	}
	
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		
		for(T e : list) {
			
			c.accept(e);
			
		}
		
	}
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f){
		
		List<R> result = new ArrayList<R>();
		for(T e: list) {
			
			result.add(f.apply(e));
			
		}
		return result;
		
	}

}
