package com.devdojo.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.devdojo.streams.classes.Pessoa;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pegar os tres primeiros nomes das pessoas com menos de 25 anos
		// Ordenados pelo nome
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));

		List<String> nomes = new ArrayList<String>();

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 25) {
				nomes.add(pessoa.getNome());
				if (nomes.size() >= 3)
					break;
			}

		}
		System.out.println(nomes);
		
		List<String> nomes2 = pessoas.stream().filter(p -> p.getIdade() < 25)
				.sorted(Comparator.comparing(Pessoa::getNome))
				.limit(3)
				.map(Pessoa::getNome)
				.collect(Collectors.toList());
		System.out.println(nomes2);

	}

}
