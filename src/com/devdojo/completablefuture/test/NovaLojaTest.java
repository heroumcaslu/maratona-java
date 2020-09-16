package com.devdojo.completablefuture.test;

import java.util.List;
import java.util.stream.Collectors;

import com.devdojo.completablefuture.Desconto;
import com.devdojo.completablefuture.Loja;
import com.devdojo.completablefuture.NovaLoja;
import com.devdojo.completablefuture.Orcamento;

public class NovaLojaTest {

	public static void main(String[] args) {
		
		List<NovaLoja> lojas = NovaLoja.lojas();
		
		lojas.stream().forEach(novaLoja -> System.out.println(novaLoja.getPreco()));
		
	}
	
	private static List<String> acharPrecos(List<NovaLoja> lojas) {

		System.out.println("Stream sequencial");
		long start = System.currentTimeMillis();
		
		List<String> collect = lojas.stream()
				.map(NovaLoja::getPreco)
				.map(Orcamento::parse)
				.map(Desconto::calcularDesconto)
				.collect(Collectors.toList());

		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}
	
}
