package com.devdojo.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.devdojo.streams.classes.Pessoa;

public class StreamTest4Reduce {

	public static void main(String[] args) {
		
		Stream<Integer> stream = getStream();
		
		Optional<Integer> reduce = stream.reduce((x,y) -> x+y);
		System.out.println(reduce.get());
		
		stream = getStream();
		Integer reduce2 = stream.reduce(0, (x,y) -> x+y);
		
		stream = getStream();
		//method reference
		Optional<Integer> reduce3 = stream.reduce(Integer::sum);
		
		Optional<Integer> reduce4 = getStream().reduce((x,y)->x*y);
		
		System.out.println(reduce4);
		
		//Optional<Integer> reduce5 = getStream().reduce((x, y) -> x > y ? x : y);
		Optional<Integer> reduce5 = getStream().reduce(Integer::max);
		System.out.println(reduce4.get());
		
		Stream<Pessoa> streamPessoa = Pessoa.bancoDePessoas().stream();
		Optional<Double> reduce6 = streamPessoa.filter(p -> p.getSalario() > 4000)
		.map(Pessoa::getSalario)
		.reduce(Double::sum);
		
		System.out.println(reduce6.get());
		
		double sum = streamPessoa.filter(p -> p.getSalario() > 4000)
			.mapToDouble(Pessoa::getSalario)
			.sum();
		
		System.out.println(sum);
		
		DoubleStream mapToDouble = streamPessoa.filter(p -> p.getSalario() > 4000)
		.mapToDouble(Pessoa::getSalario);
		
		Stream<Double> doubleStream = mapToDouble.boxed();
		
	}

	private static Stream<Integer> getStream() {
		return Arrays.asList(1,2,3,4,5,6).stream();
	}
	
}
