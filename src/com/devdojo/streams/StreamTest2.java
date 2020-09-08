package com.devdojo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> nomes = new ArrayList<List<String>>();
		
		nomes.add(Arrays.asList("DevDojo", "Valeu por aumentar a letra"));
		nomes.add(Arrays.asList("William", "pq vc demorou 180 aulas pra isso?"));
		
		List<String> flatMap = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		flatMap.forEach(System.out::println);
		
		System.out.println(nomes);
		
		List<String> palavras = Arrays.asList("Olá", "Goku");
		
		String[] split = palavras.get(0).split("");
		System.out.println(Arrays.toString(split));
		
		List<String[]> collect = palavras.stream().map(p->p.split("")).collect(Collectors.toList());
		
		Stream<String> stream = Arrays.stream((String[]) palavras.toArray());
		palavras.stream().map(p->p.split(""))
		.flatMap(Arrays::stream)
		.collect(Collectors.toList());
		
		
		

	}

}
