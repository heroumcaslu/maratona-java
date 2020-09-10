package com.devdojo.streams.tests;

import java.util.Comparator;
import java.util.List;

import com.devdojo.streams.classes.Pessoa;

public class StreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		System.out.println(pessoas.stream().anyMatch(p->p.getSalario() > 4000));
		pessoas.stream().allMatch(p -> p.getIdade() > 18);
		pessoas.stream().noneMatch(p -> p.getIdade() < 18);
		pessoas.stream()
			.filter(p->p.getIdade() < 25)
			.findAny()
			.ifPresent(p -> System.out.println(p.getNome()));
		pessoas.stream()
			.filter(p-> p.getIdade() > 30)
			.sorted(Comparator.comparing(Pessoa::getIdade).reversed())
			.findFirst()
			.ifPresent(p -> System.out.println(p.getNome()));
		
		

	}

}
