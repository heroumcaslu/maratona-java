package com.devdojo.streams.tests;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.devdojo.streams.classes.Pessoa;

public class StreamTest6Collectors1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Redução e sumarização de streams em um valor unico
		// Agrupamento de elementos
		// Particionamento de elementos
		
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		//Stream
		System.out.println(pessoas.stream().count());
		//Collectors - quando utilizar uma combinação de outros collectors
		//System.out.println(pessoas.stream().collect(Collectors.counting()));
		System.out.println(pessoas.stream().collect(counting()));
		
		//Optional<Pessoa> max = pessoas.stream().max(Comparator.comparing(Pessoa::getSalario));
		Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario));
		System.out.println(max.get().getSalario());
		
		Optional<Pessoa> collect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
		System.out.println(collect.get().getSalario());
				
		Optional<Pessoa> collect1 = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
		System.out.println(collect1.get().getSalario());
		
		//melhor forma
		pessoas.stream().mapToDouble(Pessoa::getSalario).sum();
		pessoas.stream().collect(Collectors.summingDouble(Pessoa::getSalario));
		
		
		pessoas.stream().mapToDouble(Pessoa::getSalario).average();
		pessoas.stream().collect(Collectors.averagingDouble(Pessoa::getSalario));
		
		pessoas.stream().mapToDouble(Pessoa::getSalario).min();
		pessoas.stream().collect(Collectors.minBy(comparing(Pessoa::getSalario)));
		
		DoubleSummaryStatistics collect2 = pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getSalario));
		
		System.out.println(collect2);
		System.out.println(collect2.getMax());
		
		pessoas.stream().map(Pessoa::getNome).collect(Collectors.joining(", "));
		

	}

}
